Designed By	Salma Mohamed												
Requirement ID	"Requirement
Description"	Scenario ID	"Scenario
Description"	Test cases ID	TC Description	Pre-Condition	Test Steps	Test Data	Type	Expected Result	Actual Result	Status	Priority 
R1	"The app should install correctly and launch 
without issues."	S1.1	"Verify App Installation and 
Launch"	TC1.1.1	"Verify app installation and launch on 
Android/IOS"	"1. Device is running Android/IOS.
2. Valid Google/Apple account credentials are available.

"	"1. Open Google/Apple Store.
2. Search for ""Any.do"".
3. Download and install the app.
4. Launch the app."	N/A	Installation	"The app installs without errors and 
launches to login screen."	"The app installs without errors and 
launches to login screen."	Passed	High 
R2	The app should NOT install with Low Storage	S2.1	"Device has insufficient 
storage space."	TC2.1.1	"Verify that the installation fails gracefully 
when there is insufficient storage on an Android/IOS device."	"1. Device is running Android/IOS.
2. Valid Google/Apple account credentials are available.

"	"1.Open Google Play Store.
2.Search for ""Any.do"".
3.Attempt to download and install the app."	N/A	Installation	"The installation should fail with an appropriate 
error message indicating insufficient storage space."			Low
R3	"Users should be able to
log in using their 
email credentials/Facebook account/
Google account"	S2.1	"Successful login using 
Google account"	TC3.1.1	"Verify that the user can log in with
 a valid Google account
(Fill all fields with valid Data)"	"1. Device is running Android .
2. Valid Google account credentials are available.
3. Any.do app is installed from Google Play Store.
link: https://play.google.com/store/apps/details?id=com.anydo"	"1. Open Any.do  App for aAdroid device
2. click on continue with Google
3. Select your Google Account "	"Email:salma.QA@gmail.com
password:113sss"	Funcational	"Login successfully 
& showing name , 
email and profile picture for Google account"	"Login successfully 
"	Passed	High 
R3	"Users should be able to
log in using their 
email credentials/Facebook account/
Google account"	S2.2	"Successful login using 
Facebook account"	TC3.1.2	"Verify that the user can log in with
 a valid facebook account
(Fill all fields with valid Data)"	"1. Device is running Android .
2. Valid Google account credentials are available.
3. Any.do app is installed from Google Play Store.
link: https://play.google.com/store/apps/details?id=com.anydo"	"1. Open Any.do  App for Anroid device
2. Click on Facebook Icon
3. Confirm your Facebook Account "	"Email:salma.QA@yahoo.com
password:113sss"	Funcational	"Login successfully 
& showing name , 
email and profile picture for Facebook account"	"Login successfully 
"	Passed	High 
R3	"Users should be able to
log in using their 
email credentials/Facebook account/
Google account"	S2.3	"Successful login using 
Email credentials"	TC3.1.3	"Verify that the user can log in with
 a valid Email credentials
(Fill all fields with valid Data)"	"1. Device is running Android .
2. Valid Google account credentials are available.
3. Any.do app is installed from Google Play Store.
link: https://play.google.com/store/apps/details?id=com.anydo"	"1. Open Any.do  App for Anrdoid device
2. Click on Email Icon
3. Add email 
4. add Name
5. Enter Password"	"Email:salma.QC@gmail.com
Name:Salma Mohamed
Pasword:113Saaaa"	Funcational	"Login successfully 
& showing name and
email that the User entered "	"Login successfully 
"	Passed	High 
R4	User must be able to add new tasks	S4.1	"Verify Adding a New Task to
 the To-Do List"	TC4.1.1	Add new task	"1. Device is running Android .
2. Valid Google account credentials are available.
3. Any.do app is installed from Google Play Store.
link: https://play.google.com/store/apps/details?id=com.anydo"	"1. Open app 
2. Log in 
3. Navigate to the main screen 
4. Tap ""Add Task"" 
5. Enter task details
6. Click on save task"	N/A	Funcational	"New task is added to the to-do list 
and displayed on the main screen"	"New task is added to the to-do list 
and displayed on the main screen"	Passed	High 
R4	User must be able to add new tasks	S4.2	"Verify Adding a New Task to
 the To-Do List"	TC4.1.2	Add new task - without custom date	"1. Device is running Android .
2. Valid Google account credentials are available.
3. Any.do app is installed from Google Play Store.
link: https://play.google.com/store/apps/details?id=com.anydo"	"1. Open app 
2. Log in 
3. Navigate to the main screen 
4. Tap ""Add Task"" 
5. Enter task details without custom date 
6. Click on save task"	N/A	Funcational	"New task is added to the to-do list Under today Tasks 
and displayed on the main screen"	"New task is added to the to-do list Under today Tasks 
and displayed on the main screen"	Passed	Medium
R5	Task title should have character limits	S5.1	"Verify Boundary Conditions 
for Task Title"	TC5.1.1	Task title with excessive length	"1. Device is running Android .
2. Valid Google account credentials are available.
3. Any.do app is installed from Google Play Store.
link: https://play.google.com/store/apps/details?id=com.anydo"	"1. Open app 
2. Log in 
3. Navigate to the main screen 
4. Tap ""Add Task"" 
5. Enter a very long title 
6. Click on save task"	N/A	Funcational	Error message prompts user about title length limit			Medium
R6	"The app should handle interruptions 
from incoming calls properly and maintain its state."	S6.1	"Verify App Functionality 
During Incoming Calls"	TC6.1.1	"Ensure that the app handles interruptions 
from incoming calls properly."	"1. Device is running Android .
2. Valid Google account credentials are available.
3. Any.do app is installed from Google Play Store.
link: https://play.google.com/store/apps/details?id=com.anydo"	"1. Open the Any.do the app and start using it.
2. Receive an incoming call during wright title for Task.
3. End the call and return to the app."	n/a	Funcational	"The app resumes correctly and 
maintains the state it was in before the call."	"The app resumes correctly and 
maintains the state it was in before the call."	Passed	Medium
