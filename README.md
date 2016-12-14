# introsde-2016-assignment-3
## Samuele Malavasi | mat.182551
The third assignment for the course of introduction of service design (a.a. 2016-2017) aims to implement a soap service on a heroku server and a client able to consume the service offered.
I used Ivy to manage dependencies and ant to automate the ivy installation, dependencies retrieving, java compiling and execution. The server is already deployed on heroku.

> http://sm-introsde-assignment-3.herokuapp.com/ws/people?wsdl

### About the code

**Client** Makes a bunch of requests to the remote heroku server to test its functionalities and tests the response, every request-response is printed in a log file
  * `M7` Firstly retrieves the different types of measures inside the Measure table 
  * `M1` Asks for the complete List of people inside Person table
  * `M2` Retrieves the Person instance with the first id found in the previous list
  * `M3` Updates firstname and lastname of the retrieved person
  * `M4` Creates a new person inside the db and check the id of the new entry
  * `M5` Deletes the just created person
  * `M6` Retrieves the whole list of measures belonging to a specific person for a given type e.g. height
  * `M8` Retrieves one specific measure 
  * `M9` Creates a new measure inside the db and check the id of the new entry
  * `M10` Updates the measure value of a specific person

### About the tasks
Everything written in `build.xml` is useful to run **execute.client** target.
Before running **execute.client** ant will,

* compile the classes
* run the client against the selected server

### How to run
It is possible to make the client work locally by running:
> git clone https://github.com/billyLumberjack/introsde-2016-assignment-3-client

> cd introsde-2016-assignment-3-client

> ant execute.client
