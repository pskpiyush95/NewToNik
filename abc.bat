set projectLocation=C:\Selenium\CustomerTest
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*;%projectLocation%\bin\test\CustTest;
java  org.testng.TestNG %projectLocation%\testng.xml