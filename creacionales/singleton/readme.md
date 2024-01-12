```mermaid
graph TD
  subgraph Singleton Pattern
    A[Singleton]
    A --> B{instancia única}
    A --> C{getInstance()}
    C --> D[Instancia existente]
    C --> E[Crear instancia si no existe]
  end
```
