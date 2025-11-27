# 4A. Sistema para la tienda departamental Dreams  
## Versión Alterna (Redacción distinta)

### Introducción
El desarrollo de sistemas orientados a objetos permite modelar escenarios del mundo real mediante clases y relaciones entre entidades. En esta versión alterna, se presenta una propuesta de diseño para un sistema que gestione productos, clientes y ventas dentro de la tienda departamental Dreams. El enfoque principal es representar de forma clara cómo interactúan los objetos y cómo fluyen los datos durante una compra.

### Desarrollo
#### 1. Análisis general
- Se identificaron entidades clave del dominio: **Producto**, **Cliente**, **Venta** e **ItemCuenta**.
- Se definieron atributos y métodos relevantes para representar su comportamiento.
- Se establecieron relaciones que permiten mantener coherencia entre compras, clientes y productos.

#### 2. Identificación de clases
- **Producto**: Representa un artículo disponible en el inventario.
- **Cliente**: Registra la información básica del comprador.
- **ItemCuenta**: Describe un producto dentro de una venta, incluyendo la cantidad solicitada.
- **Venta**: Agrupa los elementos de la compra y el cliente asociado.
- **MainArranque**: Ejecuta la lógica del sistema y coordina la interacción entre objetos.

#### 3. Atributos y métodos principales
(Se mantienen los mismos atributos y métodos utilizados en la versión original.)

#### 4. Relaciones entre clases
- **Venta** depende directamente de **Cliente**, ya que cada venta debe estar vinculada a una persona específica.
- **Venta** se compone de varios **ItemCuenta**, los cuales actúan como un puente hacia los productos.
- **Producto** mantiene y actualiza su stock según los registros de la venta.
- **MainArranque** únicamente orquesta el funcionamiento; no forma parte del modelo conceptual del negocio.

### Diagrama (igual estructura lógica, no incluido aquí para evitar duplicación)

### Conclusiones
- El diseño propuesto facilita la comprensión del flujo de información dentro del sistema de ventas.
- La relación directa entre Venta y Cliente es fundamental para asegurar trazabilidad y coherencia en el sistema.
- Modelar adecuadamente las asociaciones permite generar un sistema más mantenible y extensible conforme crezcan los requerimientos de la tienda.

