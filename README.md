# analysis-e2e
For semi-automated end-to-end testing of Conveyal Analysis:
- Install Katalon Studio
- Clone this repo
- In Katalon Studion, File --> Open Project --> select cloned repo
- Duplicate `Data Files/Credentials`, replacing the username and password in the new `Credentials - Copy` (`.gitignore`d), which will be used to login

Certain test cases wait for specific user inputs:
- Moving travel time cutoff to 120 min when isochrones are displayed
