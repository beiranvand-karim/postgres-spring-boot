# Screenshot service

We want you to help us build a screenshot as a service. This means we'd like to see a
component/service that accepts a list of URLs and returns a screenshot of each web page. This
should be designed as a back-end service that you could run in a data center and offer this as a
service.

The interface to the main application could be a command-line interface so there is no need to
build a frontend... if you don’t want to.

- So input:        A list of URLs for the component/service to take a screenshot of
- and output:     A single screenshot of each URL.


One possible scenario could be that the user enters a list of URLs separated by “;”, or a file with
the URLs.

The service should store the result of the request (Oh, how do you store the data?). The user
would then be able to query the service for the results—the user should be able to retrieve the
results at any point in the future.

Message queues could be used to separate the different parts of the service and prepare for
scalability.


## Things to keep in mind
Make sure your solution to the challenge is written in one of the following languages: Java, C#,
Go, Python, JavaScript, or PHP. We don’t care how you store the data—do you love
databases? Then use one. How about message queues or other APIs? What about persisting
with the screenshots?

You are free to use any supporting technology you like, just get the challenge solved! Try
something new or stick to what you know.


However, we expect a brief specification on how your solution should be scaled to handle up to
1,000,000 screenshots per day as an enterprise infrastructure component.

In order to make it easier for us to review your solution, we will be very happy if you include a
Dockerfile to run the solution or provide some other easy means of running the solution (e.g.
shell script).

## Before sending the solution of your challenge make sure you have the following:

- Have you included a readme file describing your solution? Have you provided important
  information for the developers?
  
 - Does your solution run properly? Is it easy to install and execute?
 
 - Have you included information about how you would scale the service?
 
 
 
 Good luck! Go hack yourself!