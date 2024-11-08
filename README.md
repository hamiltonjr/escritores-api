# Escritores
Essa é uma API Rest de escritores da Literatura Mundial.

## Diagrama de classes
```mermaid
classDiagram
    class Writer {
        - String name
        - BirthInfo birthInfo
        - DeathInfo deathInfo
        - List~Work~ works
    }

    class BirthInfo {
        - String date
        - String city
        - String country
    }

    class DeathInfo {
        - String date
        - String city
        - String country
    }

    class Work {
        - String title
    }

    Writer "1" *-- "1" BirthInfo
    Writer "1" *-- "0,1" DeathInfo
    Writer "1" *-- "*" Work

```
