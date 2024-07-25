# Optional Singleton
Optional Singleton is the name of this adaptation of the Singleton Design Pattern that strives to be more test friendly while also maintening the global scope that is the main purpose of the pattern.

<p align="center">
  <img src="https://github.com/user-attachments/assets/ee01b36e-23b7-4349-ab21-082aacf98629" width="480px" />
</p>

I came up with this sample project to test the viability of a code structure idea for another project: the [Figure Engine](https://github.com/nadjiel/figure-engine).

The structure consists of a class with a public constructor, which allows the creation of multiple different instances whenever necessary, but also methods to access and create an instance that is stored in a static field, which could be used anywhere in the application the same way the Singleton pattern would allow.
The advantage of this implementation is that having the possibility to create multiple instances allows for better testability, guaranteeing that each test affects only its own private state.

This approach is not perfect tough, as sharing global state is always dangerous and can open up space for undesired side effects in the code when interacting with instances from multiples places.

The objective of this pattern is to provide a global access to classes that implement it, while also leaving room for a shared instance.

Taking into account that this pattern is extremely similar to Singletons it is worth noting that it can be as dangerous as it, since global state in a application is likely to be bug-prone. There are times tough,that this kind of approach can be put to good use.

## 💻 Implementation
In the files of this repository you can find how the suggested implementation was realized. The language chosen here was Java, but the concept is valid for any OO language. Also, all the files are documented so that they are even easier to understand.

## ✍️ Author [@nadjiel](https://github.com/nadjiel)
