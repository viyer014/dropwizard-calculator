Dropwizard - 
  - A java framework that bundles many libraries to make building web 
  applications easier and more efficient. 
  - Jersey is our server. It can only take in JSON objects. 
  - We like to make many different kinds of objects, so Jackson is used.
  - Jackson maps Java objects to JSON. 

  - The Calculator Project -
    - Made a very simple calculator in a very unsimple way. 
    - CalculatorConfiguration: The configuration class that specifies 
    parameters of the project. In our case, we only needed to specify the 
    default value since everything else is an input that the user defines. 
      - The configuration class reads the parameters from the YAML file via 
      magic. 
      - Just kidding, it is handled by Jackson. 
    -CalculatorApplication: The application class pulls together the different 
    bundles and starts the application. 
      -Hello run method. 
    -Calculation: This is our representation class. It specifies the parameters 
    of our object and what it does. 
      -In our case, a calculation is an object that consists of an operation,
      two values, and a result. 
      -Allows Jackson to take this object and deserialize it to JSON. 
      -Idk where this is happening and being used though...
    -CalculatorResource: The resource class. Handles paths and "directs traffic."
    -CalculatorService: The place where the traffic gets directed to. Handles the
    meat of the program. In our case this is where the calculation happens. 

And BAM! we have a calculator. 
But wait...

Let's add more levels to this. 

In order to make this simply unsimple calculator. We have to make a lot of objects.
To make Object A we need Object B and Object C. But to make Object B, we need an
Object Y and Object Z. But to make Object Z we need Object M and Object N. 

See where this is going. It's like Russian Nesting Dolls. You need to keep opening 
and going through each class and seeing what it's dependencies are until you find 
the class with no dependencies. The base class or object that will help make other
objects.  Normally, this is done by creating new instances of each object and their 
dependencies. But this is no fun. 

So, we use the power of the dependency injection AKA Guice. Guice maps these
dependencies and injects them (hence the name) where necessary. So, we eliminate
the use of the term new. 
