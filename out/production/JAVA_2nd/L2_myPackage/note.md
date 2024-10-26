1. Package: is a folder.

2. Suppose you want to create 2 classes within a folder/package with the same name => you can't. Unless you put both of them in separate packages.

3. to access something from a different package:

   - **NOTE :** we can access classes from the current package without using import statements.

   - either import them: `import NestingOfPackages.className`
   - Or use: `packageName.className`

4. package definition should be 1st statement.

5. - `somePath(it's the classpath)>` javac package1/package2/myClass.java
   - Since in myClass.java: 1st line: package package1/package2;

   - so when it compiles it, it looks for package1/package2 from the classpath only.

   - But if we'd have done: `prev classpath/package1/package2>` javac myCLass.java
   - compilation failed bcz: from the new classpath, it cannot find package1/package2 as mentioned in myClass.java

6. naming convention for package: `company name in reverse.folderName`
