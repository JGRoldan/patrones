# Abstract Factory
```mermaid
graph TD
    A[AbstractFactory]
    A --> B{CreateProductA(-)}
    A --> C{CreateProductB(-)}
    B --> D[AbstractProductA]
    B --> E[ConcreteProductA1]
    B --> F[ConcreteProductA2]
    C --> G[AbstractProductB]
    C --> H[ConcreteProductB1]
    C --> I[ConcreteProductB2]
    B --> J[...]
    C --> K[...]
```
