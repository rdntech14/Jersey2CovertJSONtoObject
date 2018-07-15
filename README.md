Convert JSON to Object using Jersey 2
=====
Jersey internally uses Jackon API

This example demonstrate how to convert JSON into java object.
1) JSON.json ( in a file) --> JAVA Object (POJO)
2) jsonToString ( in a string variable) --> JAVA Object (POJO)
3) JSON from URL ( URL returns JSON ( JSON Array )) --> JAVA Object (POJO)  // How to handle JSON Array


**Prerequisite :**

Please download rest jar from 
*https://github.com/rdntech14/RESTWebServiceJar*

This is a REST web service should be executing on local machine and return result in JSON format.

```
java -jar rest.jar
```

**add jersey-media-json-jackson in pom.xml**

```
<dependency>
			<groupId>org.glassfish.jersey.media</groupId>
			<artifactId>jersey-media-json-jackson</artifactId>
			<version>2.25.1</version>
</dependency>

```

**Program Output**

Input : 

```
{
  "name" : "mike",
  "id" : 11,
  "roles" : [ "dev", "tester" ]
}

```

Output : 

```
POJOObject [name=mike, id=11, roles=[dev, tester]]
mike
POJOObject [name=mike, id=11, roles=[dev, tester]]
11
MyPOJO [id=2, firstName=firstname, lastName=lname, email=1111aaaa2@gmail.com, programme=prog, courses=[ca, cb]]
```

**For URL**
Input : 

```
[
    {
        "id": 1,
        "firstName": "fname",
        "lastName": "lname",
        "email": "1111aaaa@gmail.com",
        "programme": "prog",
        "courses": [
            "ca",
            "cb"
        ]
    },
    {
        "id": 2,
        "firstName": "firstname",
        "lastName": "lname",
        "email": "1111aaaa2@gmail.com",
        "programme": "prog",
        "courses": [
            "ca",
            "cb"
        ]
    },
    {
        "id": 3,
        "firstName": "Reece",
        "lastName": "Jason",
        "email": "tincidunt.dui@ultricessit.co.uk",
        "programme": "Computer Science",
        "courses": [
            "Calculus",
            "Algorithms",
            "Software Development",
            "Ethics"
        ]
    }
]
```
Output 
```
  MyPOJO [id=2, firstName=firstname, lastName=lname, email=1111aaaa2@gmail.com, programme=prog, courses=[ca, cb]]  
```