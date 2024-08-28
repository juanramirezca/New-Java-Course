# Installation of Java
1. **Download the JDK**:
* Go to the following page: https://www.oracle.com/java/technologies/downloads/#jdk17-windows
* Select the latest LTS version of Java that matches your operating system.
2. Install the JDK on your computer:
* Open the downloaded .exe file and click the "Next" button.
* Click on the "Change..." button and copy the installation path, which should look like this:
  `C:\Program Files\Java\jdk-17\`.
* Click "Next" again, and once you see the message indicating that the JDK has been successfully installed, click the "Close" button.
3. Edit the PATH variable:
* Click on the Windows Start button and search for "Edit the System Environment Variables."
* In the System Properties window, click the "Environment Variables..." button at the bottom.
* In the "System variables" section, select "Path" and then click the "Edit..." button.
* In the new window, click the "New" button and paste the path to the bin folder from the JDK installation:
* C:\Program Files\Java\jdk-17\bin.
* Move this new path to the top of the list. 
* Click "OK" to close each of the open windows.
4. Verify the Java installation:
* Open a Command Prompt window and type the following command: `java -version`.
* You should see the recently installed Java version displayed.