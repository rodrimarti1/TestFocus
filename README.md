##Prerequisites:

* Have a JDK installed in the computer (in my case, I have a JDK11.0.12)
* Have Intellij installed in the computer(in my case have the latest version)
* Check if in the "environment variable" have "JAVA_HOME" variable with the value of JDK installed, if not create

## Installing gauge and complement

Step1:
* Install Gage framework from https://docs.gauge.org/getting_started/installing-gauge.html?os=windows&language=javascript&ide=vscode
* Check if in the "environment variable" have "GAUGE_HOME" variable with the value "C:\Program Files\Gauge\bin" if not create
* Check if in the "environment variable" have in "Path" variable have the value "C:\Program Files\Gauge\bin" if not add

Step2:
* In Intellij download de plugin Gauge

Step3:
* Install chocolatey following the steps in https://chocolatey.org/install
* Then for to install the web driver execute the command "choco install selenium-all-drivers" in powershell with administrator access
* Check if in the "environment variable" have "ChocolateyInstall" variable with the value "C:\ProgramData\chocolatey"
* Check if in the "environment variable" have in "Path" variable have the value "C:\tools\selenium" if not add
* Then verify the Chrome application version and go to the website "https://chromedriver.chromium.org/downloads", if the chrome application not the latest download the correct chrome driver
* Go to the "C:\tools\selenium" and replace the chrome driver if is necessary

### For the Execution

Step1:
* In Intellij open the spec file "FocusTest"

Step2:
* In "Run" menu select "Run/Debug Configuration" option

Step3:
* In "environmental variable" write "Browser=Chrome" and save

Step4:
* Run the test

For more details view the screenshot "Configure test execution.png" in target folder.