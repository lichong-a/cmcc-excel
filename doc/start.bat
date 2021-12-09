title CMCC-EXCEL(Java)

@echo off

rem ==========================================================================================

set JAVA_HOME_TEMP=source\jdk-11.0.13

set JAVA_OPTS=-Xms4g -Xmx8g -Dfile.encoding=utf-8

set JAVA_JAR=source\cmcc-excel.jar

set LAUNCH_ARGS=--server.port=9999

rem ==========================================================================================

set CLASSPATH_TEMP=".;%JAVA_HOME_TEMP%\bin;%JAVA_HOME_TEMP%\lib\dt.jar;%JAVA_HOME_TEMP%\lib\tools.jar"

rem 接收传入参数

if "%1"=="" goto doStart

if "%1"=="start" goto doStart

if "%1"=="stop" goto doShutdown

:doStart

set CMD=start

goto doExe

:doShutdown

set CMD=stop

goto doExe

:doExe

echo ======================================================================================================

echo Java Home: %JAVA_HOME_TEMP%

echo JVM Parameters:%JAVA_OPTS:"=%

echo Start Jar: %JAVA_JAR:"=%

echo Start Parameters: %LAUNCH_ARGS:"=%

echo Execute Command: %CMD%

echo ======================================================================================================

echo.

%JAVA_HOME_TEMP%\bin\java %JAVA_OPTS% -classpath %CLASSPATH_TEMP% -server -jar %JAVA_JAR% %LAUNCH_ARGS%

goto end

:notParam

echo not params

:end

pause