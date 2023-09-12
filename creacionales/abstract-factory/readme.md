# Abstract Factory
```mermaid
graph TD
    A[Abstract Factory] --> B[Abstract Product A]
    A --> C[Abstract Product B]
    D[Concrete Factory 1] -->|implements| A
    D --> E[Concrete Product A1]
    E -->|implements| B
    D --> F[Concrete Product B1]
    F -->|implements| C
    G[Concrete Factory 2] -->|implements| A
    G --> H[Concrete Product A2]
    H -->|implements| B
    G --> I[Concrete Product B2]
    I -->|implements| C
```

El patrón abstract factory es un patrón de diseño creacional que permite crear familias de objetos relacionados sin especificar sus clases concretas. Las claves del patrón abstract factory son:

- La interfaz abstract factory declara un conjunto de métodos para crear cada uno de los productos abstractos.
- Las clases concrete factory implementan los métodos de la interfaz abstract factory y crean los productos concretos correspondientes.
- Las interfaces abstract product declaran las operaciones que todos los productos concretos deben implementar.
- Las clases concrete product implementan las interfaces abstract product y definen el comportamiento específico de los productos.
- El código cliente usa la interfaz abstract factory para crear una familia de productos relacionados. El código cliente no depende de las clases concretas de los productos, sino solo de sus interfaces abstractas.
