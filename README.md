# BANCA-system

# Consigna
Tienes un sistema que procesa la creación de cuentas bancarias para nuevos clientes. El caso de uso es el siguiente:

Se recibe una solicitud con los datos de un cliente potencial (nombre, email, edad, saldo inicial).
Se debe validar que los datos del cliente sean correctos antes de crear la cuenta bancaria.
Reglas de negocio para validar:
- El nombre no puede estar vacío.
- El email debe tener un formato válido.
- El cliente debe tener al menos 18 años.
- El saldo inicial debe ser mayor a 1000.
Tu tarea será implementar este Use Case de creación de cuentas bancarias, donde se aplique la validación de los datos del cliente antes de que se cree su cuenta. También debes escribir los tests utilizando Mockito para verificar que las validaciones se apliquen correctamente.

# Requisitos:
El caso de uso debe validar los datos del cliente antes de llamar a un servicio que crea la cuenta.
Implementar los tests unitarios con Mockito, donde se verifique que las validaciones se comportan como se espera.
