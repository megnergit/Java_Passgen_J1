# Safari-like Password generator

## Motivation
I like safari-like password, as it is easier to type in. 
It is cumbersome to open safari to create a password every time I need it. 
In addition, 15 letters sounds a bit too short. 

We will make a password generator with Java, as I would like to learn the 
language a bit. 

The generator is supposed to be secure, as it uses "system entropy" as a
seed of the random number generation. 

## Procedure
1. Create a project with Maven

mvn archetype:generate \
    -DgroupId=com.example \
    -DartifactId=password-generator \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DinteractiveMode=false

groupId    : project organization name (="com.example")
artifactId : project name (="password-generator")

2. Directory structure is now like this.

password-generator
├── pom.xml
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── example
    │               ├── PasswordGenerator.java   <+ add this here.
    │               └── App.java
    └── test
	└── java
            └── com
                └── example
                    └── AppTest.java

3. Write "PasswordGenerator.java" on VS Code (ChatGPT provided it)

4. Edit pom.xml to add the main class

<build>
    <plugins>
	<plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-jar-plugin</artifactId>
            <version>3.2.0</version>
            <configuration>
		<archive>
                    <manifest>
			<mainClass>com.example.PasswordGenerator</mainClass>
                    </manifest>
		</archive>
            </configuration>
	</plugin>
    </plugins>
</build>

5. Build and package everything in one command:
$ mvn clean package

6. Rename the generated JAR (optional, but cleaner):
$ mv target/password-generator-1.0-SNAPSHOT.jar target/passgen.jar

7. Add alias in ~/.zshrc
alias passgen="java -jar $HOME/java/j2/password-generator/target/password-generator-1.0-SNAPSHOT.jar

8. Test it
$ source ~/.zshrc
$ passgen
Generated Password: OTPcM-OtEHD-U4Kxs-WZMVi-X3ayd

Yeahaa-

<!-- ------------------------------  -->

# END

<!-- ####################  -->
