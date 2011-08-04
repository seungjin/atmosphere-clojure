(ns atmosphere.aws)

(import '(java.util HashSet List Set))

(import 'com.amazonaws.AmazonClientException)
(import 'com.amazonaws.AmazonServiceException)
(import 'com.amazonaws.auth.AWSCredentials)
(import 'com.amazonaws.auth.PropertiesCredentials)
(import 'com.amazonaws.services.ec2.AmazonEC2)
(import 'com.amazonaws.services.ec2.AmazonEC2Client)
(import 'com.amazonaws.services.ec2.model.DescribeAvailabilityZonesResult)
(import 'com.amazonaws.services.ec2.model.DescribeInstancesResult)
(import 'com.amazonaws.services.ec2.model.Instance)
(import 'com.amazonaws.services.ec2.model.Reservation)
(import 'com.amazonaws.services.s3.AmazonS3)
(import 'com.amazonaws.services.s3.AmazonS3Client)
(import 'com.amazonaws.services.s3.model.Bucket)
(import 'com.amazonaws.services.s3.model.ObjectListing)
(import 'com.amazonaws.services.s3.model.S3ObjectSummary)
(import 'com.amazonaws.services.simpledb.AmazonSimpleDB)
(import 'com.amazonaws.services.simpledb.AmazonSimpleDBClient)
(import 'com.amazonaws.services.simpledb.model.DomainMetadataRequest)
(import 'com.amazonaws.services.simpledb.model.DomainMetadataResult)
(import 'com.amazonaws.services.simpledb.model.ListDomainsRequest)
(import 'com.amazonaws.services.simpledb.model.ListDomainsResult)


(println "===========================================")
(println "Welcome to the AWS Java SDK!")
(println "===========================================")

;Original Java code
;
;AWSCredentials credentials = new PropertiesCredentials(AwsConsoleApp.class.getResourceAsStream("AwsCredentials.properties"));
;ec2 = new AmazonEC2Client(credentials);
;s3  = new AmazonS3Client(credentials);
;sdb = new AmazonSimpleDBClient(credentials);
;
;try {
;     DescribeAvailabilityZonesResult availabilityZonesResult = ec2.describeAvailabilityZones();
;     System.out.println("You have access to " + availabilityZonesResult.getAvailabilityZones().size() + " Availability Zones.");
;     DescribeInstancesResult describeInstancesRequest = ec2.describeInstances();
;     List<Reservation> reservations = describeInstancesRequest.getReservations();
;     Set<Instance> instances = new HashSet<Instance>();
;     for (Reservation reservation : reservations) { instances.addAll(reservation.getInstances()); }
;     System.out.println("You have " + instances.size() + " Amazon EC2 instance(s) running.");
;} catch (AmazonServiceException ase) {
;    System.out.println("Caught Exception: " + ase.getMessage());
;    System.out.println("Reponse Status Code: " + ase.getStatusCode());
;    System.out.println("Error Code: " + ase.getErrorCode());
;    System.out.println("Request ID: " + ase.getRequestId());
;}
