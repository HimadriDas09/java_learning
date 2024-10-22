1. `Constructor:` is a method in class which does not have a return types and have the same name as the class.

2. It is used to set the default value of the instance variables.

   - Once objects are created. 1st constructor is called on the object itself.

3. `Default Constructor:`

   - when constructor fn doesn't have any parameters and set the default value as (default value acc to data types).

     - String: null
     - int : 0

   - By default, it's implementation in a class is hidden.

   - But we can override it by providing our own implementation.

4. `Parameterized Constructor:`

   - have parameters.
   - so we need to pass argument during object creation itself.

5. **_NOTE :_** as soon as we write our implementation of constructor, default constructor provides by class itself cannot be used.

6. **NOTE :** Even if we write our default constructor and keep the method body empty: still fields will contain default value.

   - Bcz variables created in JAVA, initially contain default value.
