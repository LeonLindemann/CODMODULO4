# 4A. Sistema para la tienda departamental Dreams
Módulo 4. Programación con Java
### Alumno: José Daniel Martínez Cornelio

## Introducción
El desarrollo de sistemas orientados a objetos permite modelar escenarios del mundo real mediante clases y relaciones entre entidades. En esta versión alterna, se presenta una propuesta de diseño para un sistema que gestione productos, clientes y ventas dentro de la tienda departamental Dreams. El enfoque principal es representar de forma clara cómo interactúan los objetos y cómo fluyen los datos durante una compra.

## Desarrollo
### 1. Análisis
- Se identificaron entidades clave del dominio: **Producto**, **Cliente**, **Venta** e **ItemCuenta**.
- Se definieron atributos y métodos relevantes para representar su comportamiento.
- Se establecieron relaciones que permiten mantener coherencia entre compras, clientes y productos.

### 2. Identificación de Clases y Objetos
- **Producto**: Representa un artículo disponible en el inventario.
- **Cliente**: Registra la información básica del comprador.
- **ItemCuenta**: Describe un producto dentro de una venta, incluyendo la cantidad solicitada.
- **Venta**: Agrupa los elementos de la compra y el cliente asociado.
- **MainArranque**: Ejecuta la lógica del sistema y coordina la interacción entre objetos.


### 3. Definición de Atributos y Métodos
| Clase       | Atributos                                                                 | Métodos principales                                                                 |
|--------------|---------------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| **Cliente**  | - nombre: String<br>- correo: String                                      | + Cliente(String, String)<br>+ getNombre(): String<br>+ getCorreo(): String         |
| **Producto** | - nombre: String<br>- precio: double<br>- categoria: String<br>- stock: int | + Producto(String, double, String, int)<br>+ getPrecio(): double<br>+ getStock(): int<br>+ getNombre(): String<br>+ getCategoria(): String<br>+ validarStock(int): boolean<br>+ reducirStock(int): void |
| **ItemCuenta** | - producto: Producto<br>- cantidad: int                                 | + ItemCuenta(Producto, int)<br>+ calcularSubtotal(): double<br>+ getProducto(): Producto |
| **Venta**    | - cliente: Cliente<br>- listaItems: ArrayList\<ItemCuenta\><br>- total: double | + Venta(Cliente)<br>+ agregarItem(ItemCuenta): void<br>+ calcularTotal(): void<br>+ generarTicket(): void<br>+ toString(): String |
| **MainArranque** | *(Sin atributos)*                                                     | + main(String[] args): void                                                        |


### 4. Relación entre Clases

- **Venta** depende directamente de **Cliente**, ya que cada venta debe estar vinculada a una persona específica.
- **Venta** se compone de varios **ItemCuenta**, los cuales actúan como un puente hacia los productos.
- **Producto** mantiene y actualiza su stock según los registros de la venta.
- **MainArranque** únicamente orquesta el funcionamiento; no forma parte del modelo conceptual del negocio.


### 5. Diagrama de Clases UML



### Preguntas de reflexión
**1. ¿Cómo se relacionan las clases entre sí?** Las clases Cliente y Producto son independientes, pero ambas se relacionan a través de Venta, que actúa como enlace entre ellas.
La clase MainArranque no forma parte de la relación entre objetos, sino que se encarga de crear las instancias y ejecutar la lógica principal del programa.`

**2. ¿Qué benefi cios aporta la POO en el diseño?** Permite modularidad, reutilización de código y facilidad para mantener y escalar el sistema.

**3. ¿Cómo se podría garantizar la precisión en el cálculo de las ventas?** Verifi cando el stock antes de realizar la venta y utilizando métodos que calculen automáticamente el total y validando que no se agreguen cifras negativas.

**4. ¿Qué mecanismos de la POO se podrían utilizar para reutilizar atributos y métodos?** La herencia permite compartir atributos y comportamientos comunes entre clases, mientras que la encapsulación protege los datos y promueve su uso controlado mediante métodos públicos.

**5. ¿Qué patrón de diseño sería adecuado para gestionar las ventas?** Podría usarse el patrón MVC (Modelo-Vista-Controlador) para separar la lógica de negocio de la interfaz de usuario.

**6. ¿Qué estrategias se podrían implementar si un cliente intenta comprar sin stock sufi ciente?** Mostrar un mensaje de error y evitar que la venta se registre hasta que haya disponibilidad.


## Conclusión general

- El diseño propuesto facilita la comprensión del flujo de información dentro del sistema de ventas.
- La relación directa entre Venta y Cliente es fundamental para asegurar trazabilidad y coherencia en el sistema.
- Modelar adecuadamente las asociaciones permite generar un sistema más mantenible y extensible conforme crezcan los requerimientos de la tienda.