#/bin/bash
# Here's a script to do everything at once

# Portland GTFS
wget https://developer.trimet.org/schedule/gtfs.zip -O trimet.gtfs.zip

# Vancouver WA GTFS
wget https://www.c-tran.com/images/Google/GoogleTransitUpload.zip -O ctran.gtfs.zip

# Oregon OSM
wget http://download.geofabrik.de/north-america/us/oregon-latest.osm.pbf -O oregon.osm.pbf

# Trim OSM to just Portland
osmium extract --strategy complete_ways --bbox -123.03863,45.31932,-122.24761,45.72343 oregon.osm.pbf -o portland.osm.pbf

# Remove buildings and other unneeded things from OSM
osmium tags-filter portland.osm.pbf w/highway w/public_transport=platform w/railway=platform w/park_ride=yes r/type=restriction -o portland-filtered.osm.pbf
