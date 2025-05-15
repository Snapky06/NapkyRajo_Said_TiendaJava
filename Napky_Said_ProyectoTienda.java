/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author saidn
 */
public class Napky_Said_ProyectoTienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Variables
        int opcion = 0, codigo = 0, dia = 1, cantidad_compras = 0, cantidad_ventas = 0, veces_caja = 1;
        int cantidad_avena = 0, cantidad_trigo = 0, cantidad_maiz = 0, cantidad_azucar = 0;
        int cantidad_de_compras = 0, cantidad_de_ventas = 0, codigo_compras = 0, precio = 0;
        int ventas_maiz = 0, ventas_azucar = 0, ventas_trigo = 0, ventas_avena = 0;
        double efectivo = 0.0, cantidad = 0.0, compras = 0.0, subtotal = 0.0, total = 0.0;
        double compra_media = 0, mayor_ganancia_venta = 0, mayor_gasto_compra = 0, cantidad_compra_media = 0;
        double venta_media1 = 0, venta_media2 = 0, venta_media3 = 0, venta_media4 = 0, cantidad_venta_media = 0;
        double contador_compra = 0.0, contador_ventas = 0.0, ganancia_total = 0.0, gasto_total = 0.0;
        double subtotal_con_isv = 0.0, isv_de_subtotal = 0.0, caja = 0.0, azucar = 0.0, cantidad_vendida = 0.0;
        double avena = 0.0, trigo = 0.0, maiz = 0.0, descuento = 0.0, impuesto = 0.07;
        char otro_producto = 'p', ingreso_dinero, Si_No = 'n', volver_intentar_compras = 'p';
        boolean abrircaja = false, producto_disponible = false;
        double ganancia = 0;
                        double valor_medio_venta = 0;
                        double valor_medio_compra = 0;
        String mostrar_producto = "";
//FINAL VARIABLES
        System.out.println("\n|-----------------------------|");
        System.out.println("|---      Tienda Java      ---|");
        System.out.println("|-----------------------------|\n");
        //Inicio de While
        while (opcion != 6) {
            System.out.println("\n|-----------------------------|");
            System.out.println("|--- Menu Principal        ---|");
            System.out.println("|--- Hoy Es El Dia : " + dia + "    ----|");
            System.out.println("|--- [1]Abrir Caja         ---|");
            System.out.println("|--- [2]Ventas             ---|");
            System.out.println("|--- [3]Compras            ---|");
            System.out.println("|--- [4]Reportes           ---|");
            System.out.println("|--- [5]Cierre De Caja     ---|");
            System.out.println("|--- [6]Salir Del Sistema  ---|");
            System.out.print("|Seleccione (1,2,3,4,5 o 6) : ");
            opcion = leer.nextInt();
            System.out.println("|-----------------------------|\n");
//Inicio Switch Opcion
            switch (opcion) {

                case 1:
                    if (opcion == 1 && veces_caja >= 2) {
                        abrircaja = true;
                        System.out.println("\n|------------------------------------|");
                        System.out.println("|---            Caja              ---|");
                        System.out.print("|Quiere Ingresar Dinero (S/N) : ");
                        ingreso_dinero = leer.next().toUpperCase().charAt(0);

                        if (ingreso_dinero == 'S') {
                            System.out.print("|Ingrese el Monto Deseado : Lps.  ");
                            efectivo = leer.nextDouble();
                            if (efectivo > 0) {
                                caja += efectivo;
                                System.out.println("|---Monto Ingresado : Lps. " + efectivo + " ---|");
                                System.out.println("|---  Total en Caja : Lps." + caja + "  ---|");
                            } else {
                                System.out.println("|---La Cantidad No Es Valida---|");
                            }

                        } else {
                            System.out.println("|Total en Caja : Lps." + caja);
                        }
                        //FINAL OPCION DE ABRIR CAJA
                        System.out.println("|------------------------------------|\n");

                    }

                    if (opcion == 1 && dia == 1 && veces_caja == 1) {
                        abrircaja = true;
                        System.out.println("\n|----------------------------------|");
                        System.out.println("|---            Caja            ---|");
                        System.out.print("|Ingrese el Monto Deseado : Lps.");
                        efectivo = leer.nextDouble();
                        if (efectivo > 0) {
                            caja += efectivo;
                            System.out.println("|---Monto Ingresado : Lps." + efectivo + "---|");
                            veces_caja++;
                        } else {
                            System.out.println("|---  La Cantidad No Es Valida  ---|");
                        }
                        //FINAL OPCION DE ABRIR CAJA
                        System.out.println("|----------------------------------|\n");
                    }

                    break;

                case 3:
                    //If que tiene que estar la caja abierta
                    if (abrircaja) {
                        do {
                            System.out.println("|--------------------Compras---------------|");
                            System.out.println("|----------------------------------------|");
                            System.out.println("|---   Que Tipo de Proveedor Desea    ---|");
                            System.out.println("|---[A]Solo le Compramos Azucar y Maiz---|");
                            System.out.println("|---[B]Solo le Compramos Avena y Trigo---|");
                            System.out.println("|---[C]    Solo le Compramos Avena    ---|");
                            System.out.print("|Seleccione(A,B O C): ");
                            char proveedor = leer.next().toUpperCase().charAt(0);
                            System.out.println("|----------------------------------------|");

                            //Switch de Proveedor
                            switch (proveedor) {

                                //Inicio de Proveedor C
                                case 'C':

                                    if (caja >= 22) {

                                        System.out.println("\n|-----------------------------|");
                                        System.out.println("|---      Proveedor C      ---|");
                                        System.out.println("|---[2]  Avena = Lps.22k/g ---|");
                                        do {
                                            System.out.print("|Seleccione(2) : ");
                                            codigo = leer.nextInt();

                                            if (codigo == 2) {
                                                System.out.print("|Que Cantidad En k/g Desea : ");
                                                cantidad = leer.nextDouble();
                                                if (cantidad > 0 && caja >= 22 * cantidad) {
                                                    compras = 22 * cantidad;
                                                    caja -= compras;
                                                    avena += cantidad;
                                                    cantidad_de_compras += cantidad;
                                                    cantidad_compras++;
                                                    compra_media += 22 * cantidad;

                                                    if (compras > mayor_gasto_compra) {
                                                        mayor_gasto_compra = compras;
                                                    }

                                                    System.out.println("\n|----------------------------------------|");
                                                    System.out.println("|---    Producto : Avena ----------------|");
                                                    System.out.println("|---    Total : Lps." + compras + "   --------------|");
                                                    System.out.println("|---    Cantidad : " + cantidad + "k/g  --------------|");
                                                    Si_No = 'N';
                                                } else {
                                                    System.out.println("|---Cantidad Insuficiente Para La Compra---|");
                                                    System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                    Si_No = leer.next().toUpperCase().charAt(0);
                                                }
                                            } //INICIO FILTRO C
                                            else {
                                                System.out.print("|---Proveedor No Vende Este Producto---|\n");
                                                System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                Si_No = leer.next().toUpperCase().charAt(0);
                                            }

                                            //FINAL FILTRO C
                                        } while (Si_No == 'S');
                                    }
                                    System.out.println("|----------------------------------------|\n");
                                    volver_intentar_compras = 'N';
                                    //FINAL PROVEEDOR C
                                    break;
//Inicio De Compras B
                                case 'B':

                                    if (caja >= 20) {

                                        System.out.println("\n|-----------------------------|");
                                        System.out.println("|---      Proveedor B      ---|");
                                        System.out.println("|---[2]  Avena = Lps.20k/g ---|");
                                        System.out.println("|---[3]  Trigo = Lps.30k/g ---|");
                                        do {
                                            System.out.print("|Seleccione(2 o 3) : ");
                                            codigo = leer.nextInt();

                                            switch (codigo) {

                                                case 2:
                                                    System.out.print("|Que Cantidad En k/g Desea : ");
                                                    cantidad = leer.nextDouble();
                                                    if (cantidad > 0 && caja >= 20 * cantidad) {
                                                        compras = 20 * cantidad;
                                                        caja -= compras;
                                                        avena += cantidad;
                                                        cantidad_de_compras += cantidad;
                                                        cantidad_compras++;
                                                        compra_media += 20 * cantidad;

                                                        if (compras > mayor_gasto_compra) {
                                                            mayor_gasto_compra = compras;
                                                        }

                                                        System.out.println("\n|----------------------------------------|");
                                                        System.out.println("|---    Producto : Avena ----------------|");
                                                        System.out.println("|---    Total : Lps." + compras + "   --------------|");
                                                        System.out.println("|---    Cantidad : " + cantidad + "k/g  --------------|");
                                                        Si_No = 'N';
                                                    } else {
                                                        System.out.println("|---Cantidad Insuficiente Para La Compra---|");
                                                        System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                        Si_No = leer.next().toUpperCase().charAt(0);
                                                    }

                                                    break;

                                                case 3:
                                                    System.out.print("|Que Cantidad En k/g Desea : ");
                                                    cantidad = leer.nextDouble();
                                                    if (cantidad > 0 && caja >= 30 * cantidad) {
                                                        compras = 30 * cantidad;
                                                        caja -= compras;
                                                        trigo += cantidad;
                                                        cantidad_de_compras += cantidad;
                                                        cantidad_compras++;
                                                        compra_media += 30 * cantidad;

                                                        if (compras > mayor_gasto_compra) {
                                                            mayor_gasto_compra = compras;
                                                        }

                                                        System.out.println("\n|----------------------------------------|");
                                                        System.out.println("|---    Producto : Trigo ----------------|");
                                                        System.out.println("|---    Total : Lps." + compras + "   --------------|");
                                                        System.out.println("|---    Cantidad : " + cantidad + "k/g  --------------|");
                                                        Si_No = 'N';
                                                    } else {
                                                        System.out.println("|---Cantidad Insuficiente Para La Compra---|");
                                                        System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                        Si_No = leer.next().toUpperCase().charAt(0);
                                                    }
                                                    break;

                                                default:
                                                    System.out.print("|---Proveedor No Vende Este Producto---|\n");
                                                    System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                    Si_No = leer.next().toUpperCase().charAt(0);
                                                    break;
                                            }

                                        } while (Si_No == 'S');
                                    }

                                    System.out.println("|---------------------------------------|\n");
                                    volver_intentar_compras = 'N';
                                    break;
//Final De Compras B
                                    
                                    
                                    //Inicio Compras A
                                case 'A':

                                    if (caja >= 18) {

                                        System.out.println("\n|------------------------------|");
                                        System.out.println("|---      Proveedor A       ---|");
                                        System.out.println("|---[1]  Azucar = Lps.25k/g ---|");
                                        System.out.println("|---[4]   Maiz = Lps.18k/g  ---|");
                                        do {
                                            System.out.print("|Seleccione(1 o 4) : ");
                                            codigo = leer.nextInt();

                                            switch (codigo) {

                                                case 1:
                                                    System.out.print("|Que Cantidad En k/g Desea : ");
                                                    cantidad = leer.nextDouble();
                                                    if (cantidad > 0 && caja >= 25 * cantidad) {
                                                        compras = 25 * cantidad;
                                                        caja -= compras;
                                                        azucar += cantidad;
                                                        cantidad_de_compras += cantidad;
                                                        cantidad_compras++;
                                                        compra_media += 25 * cantidad;

                                                        if (compras > mayor_gasto_compra) {
                                                            mayor_gasto_compra = compras;
                                                        }

                                                        System.out.println("\n|----------------------------------------|");
                                                        System.out.println("|---    Producto : Azucar ---------------|");
                                                        System.out.println("|---    Total : Lps." + compras + "   --------------|");
                                                        System.out.println("|---    Cantidad : " + cantidad + "k/g    ------------|");
                                                        Si_No = 'N';
                                                    } else {
                                                        System.out.println("|---Cantidad Insuficiente Para La Compra---|");
                                                        System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                        Si_No = leer.next().toUpperCase().charAt(0);
                                                    }
                                                    break;

                                                case 4:
                                                    System.out.print("|Que Cantidad En k/g Desea : ");
                                                    cantidad = leer.nextDouble();
                                                    if (cantidad > 0 && caja >= 18 * cantidad) {
                                                        compras = 18 * cantidad;
                                                        caja -= compras;
                                                        maiz += cantidad;
                                                        cantidad_de_compras += cantidad;
                                                        cantidad_compras++;
                                                        compra_media += 18 * cantidad;

                                                        if (compras > mayor_gasto_compra) {
                                                            mayor_gasto_compra = compras;
                                                        }
                                                        System.out.println("\n|----------------------------------------|");
                                                        System.out.println("|---    Producto : Maiz------------------|");
                                                        System.out.println("|---    Total : Lps." + compras + "   --------------|");
                                                        System.out.println("|---    Cantidad : " + cantidad + "k/g  --------------|");
                                                        Si_No = 'N';
                                                    } else {
                                                        System.out.println("|---Cantidad Insuficiente Para La Compra---|\n");
                                                        System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                        Si_No = leer.next().toUpperCase().charAt(0);
                                                    }
                                                    break;

                                                default:
                                                    System.out.print("|---Proveedor No Vende Este Producto---|\n");
                                                    System.out.print("|Desea Volver A Intentar (S o N) : ");
                                                    Si_No = leer.next().toUpperCase().charAt(0);
                                                    break;
                                            }

                                        } while (Si_No == 'S');
                                    }

                                    System.out.println("|----------------------------------------|\n");
                                    volver_intentar_compras = 'N';
                                    break;
//Final Compras A
                                    
                                    //Inicio De Default
                                default:
                                    System.out.println("|---      Proveedor Inexistente       ---|");
                                    System.out.print("|Desea Volver A Intentar [S/N] : ");
                                    volver_intentar_compras = leer.next().toUpperCase().charAt(0);
                                    System.out.println("|----------------------------------------|\n");
                                    break;
//Final De Default
                            }

                        } while (volver_intentar_compras == 'S');

                    } else {
                        System.out.println("\n|-----------------------------|");
                        System.out.println("|---  Tiene Que Abrir Caja ---|");
                        System.out.println("|-----------------------------|\n");
                    }
                    break;
//Case de Ventas
                case 2:
                    if (abrircaja && azucar > 0 || maiz > 0 || trigo > 0 || avena > 0) {
                        System.out.println("\n|----------------------------------------------|");
                        System.out.println("\n|---------------------Ventas--------------------|");
                        System.out.println("|---           Que Proveedor Desea          ---|");
                        System.out.println("|---[A]  Vende Azucar, Avena, Trigo Y Maiz  ---|");
                        System.out.println("|---[B]  Vende Azucar, Avena Y Trigo        ---|");
                        System.out.println("|---[C]  Vende Maiz Solamente               ---|");
                        System.out.print("|Seleccione (A,B o C): ");
                        char proveedor_compras = leer.next().toUpperCase().charAt(0);
                        System.out.println("|----------------------------------------------|\n");
                        switch (proveedor_compras) {

                            //Inicio Proveedor A
                            case 'A':
                                if (azucar > 0 || avena > 0 || trigo > 0 || maiz > 0) {
                                    do {
                                    System.out.println("\n|----------------------------------------|");
                                    System.out.println("|---           Proveedor A            ---|");
                                    System.out.println("|---[1]Azucar : " + azucar + "k/g || Lps.30k/g   ---|");
                                    System.out.println("|---[2]Avena : " + avena + "k/g || Lps.25k/g    ---|");
                                    System.out.println("|---[3]Trigo : " + trigo + "k/g || Lps.32k/g    ---|");
                                    System.out.println("|---[4]Maiz : " + maiz + "k/g || Lps.20k/g     ---|");
                                    //Principio Do While
                                    
                                        System.out.print("|Seleccione (1, 2, 3 o 4) : ");
                                        codigo_compras = leer.nextInt();
                                        System.out.println("|----------------------------------------|\n");

                                        switch (codigo_compras) {

                                            case 1:
                                                System.out.println("|---------------------------|");
                                                System.out.print("|Que Cantidad En k/g Desea : ");

                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (azucar >= cantidad) {
                                                    azucar -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    producto_disponible = true;
                                                    cantidad_azucar += cantidad;
                                                    subtotal += 30 * cantidad_azucar;
                                                    cantidad_ventas++;

                                                    if (subtotal > mayor_ganancia_venta) {
                                                        mayor_ganancia_venta = subtotal;
                                                    }

                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("|---No Hay Suficiente Producto----|");
                                                    System.out.print("|----------------------------------|\n");
                                                    producto_disponible = false;
                                                }
                                                System.out.print("|Desea Comprar Otro Producto (S/N) : ");
                                                otro_producto = leer.next().toUpperCase().charAt(0);
                                                break;

                                            case 2:
                                                System.out.println("|---------------------------|");
                                                System.out.print("|Que Cantidad En k/g Desea : ");

                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (avena >= cantidad) {
                                                    avena -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    producto_disponible = true;
                                                    cantidad_avena += cantidad;
                                                    subtotal += 25 * cantidad_avena;
                                                    cantidad_ventas++;

                                                    if (subtotal > mayor_ganancia_venta) {
                                                        mayor_ganancia_venta = subtotal;
                                                    }

                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("|---No Hay Suficiente Producto----|");
                                                    System.out.print("|----------------------------------|\n");
                                                    producto_disponible = false;
                                                }
                                                System.out.print("|Desea Comprar Otro Producto (S/N) : ");
                                                otro_producto = leer.next().toUpperCase().charAt(0);
                                                break;

                                            case 3:
                                                System.out.println("|---------------------------|");
                                                System.out.print("|Que Cantidad En k/g Desea : ");

                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (trigo >= cantidad) {
                                                    trigo -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    producto_disponible = true;
                                                    cantidad_trigo += cantidad;
                                                    subtotal += 32 * cantidad_trigo;
                                                    cantidad_ventas++;

                                                    if (subtotal > mayor_ganancia_venta) {
                                                        mayor_ganancia_venta = subtotal;
                                                    }

                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("|---No Hay Suficiente Producto----|");
                                                    System.out.print("|----------------------------------|\n");
                                                    producto_disponible = false;
                                                }
                                                System.out.print("|Desea Comprar Otro Producto (S/N) : ");
                                                otro_producto = leer.next().toUpperCase().charAt(0);
                                                break;

                                            case 4:
                                                System.out.println("|---------------------------|");
                                                System.out.print("|Que Cantidad En k/g Desea : ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (maiz >= cantidad) {
                                                    maiz -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    producto_disponible = true;
                                                    ventas_maiz += cantidad;
                                                    cantidad_ventas++;

                                                    if (subtotal > mayor_ganancia_venta) {
                                                        mayor_ganancia_venta = subtotal;
                                                    }

                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("|---No Hay Suficiente Producto----|");
                                                    System.out.print("|----------------------------------|\n");
                                                    producto_disponible = false;
                                                }
                                                System.out.print("|Desea Comprar Otro Producto (S/N) : ");
                                                otro_producto = leer.next().toUpperCase().charAt(0);
                                                break;

                                        }

                                    } while (otro_producto == 'S');
                                    //Final While
                                } else {
                                    System.out.println("\n|----------------------------------|");
                                    System.out.println("|---No Hay Productos Disponibles---|");
                                    System.out.println("|----------------------------------|\n");

                                }
                                break;
                            //Final Proveedor A

                            //Inicio Proveedor B
                            case 'B':

                                if (azucar > 0 || avena > 0 || trigo > 0) {
                                    do {
                                    System.out.println("\n|----------------------------------------|");
                                    System.out.println("|---           Proveedor B            ---|");
                                    System.out.println("|---[1]Azucar : " + azucar + "k/g || Lps.30k/g   ---|");
                                    System.out.println("|---[2]Avena : " + avena + "k/g || Lps.25k/g    ---|");
                                    System.out.println("|---[3]Trigo : " + trigo + "k/g || Lps.32k/g     ---|");
                                    //Principio Do While
                                    
                                        System.out.print("|Seleccione (1, 2, o 3) : ");
                                        codigo_compras = leer.nextInt();
                                        System.out.println("|---------------------------------------|\n");

                                        switch (codigo_compras) {

                                            case 1:
                                                System.out.println("|---------------------------|");
                                                System.out.print("|Que Cantidad En k/g Desea : ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (azucar >= cantidad) {
                                                    azucar -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    producto_disponible = true;
                                                    ventas_azucar += cantidad;
                                                    cantidad_ventas++;

                                                    if (subtotal > mayor_ganancia_venta) {
                                                        mayor_ganancia_venta = subtotal;
                                                    }

                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("|---No Hay Suficiente Producto----|");
                                                    System.out.print("|----------------------------------|\n");
                                                    producto_disponible = false;
                                                }
                                                System.out.print("|Desea Comprar Otro Producto (S/N) : ");
                                                otro_producto = leer.next().toUpperCase().charAt(0);
                                                break;

                                            case 2:
                                                System.out.println("|---------------------------|");
                                                System.out.print("|Que Cantidad En k/g Desea : ");
                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (avena >= cantidad) {
                                                    avena -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    producto_disponible = true;
                                                    cantidad_avena += cantidad;
                                                    subtotal += 25 * cantidad_avena;
                                                    cantidad_ventas++;

                                                    if (subtotal > mayor_ganancia_venta) {
                                                        mayor_ganancia_venta = subtotal;
                                                    }

                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("|---No Hay Suficiente Producto----|");
                                                    System.out.print("|----------------------------------|\n");
                                                    producto_disponible = false;
                                                }
                                                System.out.print("|Desea Comprar Otro Producto (S/N) : ");
                                                otro_producto = leer.next().toUpperCase().charAt(0);
                                                break;

                                            case 3:
                                                System.out.println("|---------------------------|");
                                                System.out.print("|Que Cantidad En k/g Desea : ");

                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|\n");

                                                if (trigo >= cantidad) {
                                                    cantidad_de_ventas += cantidad;
                                                    trigo -= cantidad;
                                                    producto_disponible = true;
                                                    cantidad_trigo += cantidad;
                                                    subtotal += 32 * cantidad_trigo;
                                                    cantidad_ventas++;

                                                    if (subtotal > mayor_ganancia_venta) {
                                                        mayor_ganancia_venta = subtotal;
                                                    }

                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("|---No Hay Suficiente Producto----|");
                                                    System.out.print("|----------------------------------|\n");
                                                    producto_disponible = false;
                                                }
                                                System.out.print("|Desea Comprar Otro Producto (S/N) : ");
                                                otro_producto = leer.next().toUpperCase().charAt(0);
                                                break;

                                        }

                                    } while (otro_producto == 'S');
                                    //Final While
                                } else {
                                    System.out.println("\n|----------------------------------|");
                                    System.out.println("|---No Hay Productos Disponibles---|");
                                    System.out.println("|----------------------------------|\n");
                                }
                            //Final Proveedor B
                                
                            //Inicio Proveedor C
                            case 'C':
                                if (maiz > 0) {
                                    do {
                                    System.out.println("\n|----------------------------------------|");
                                    System.out.println("|---           Proveedor A            ---|");
                                    System.out.println("|---[4]Maiz : " + maiz + "20k/g || Lps.20k/g   ---|");
                                    //Principio Do While
                                    
                                        System.out.print("|Seleccione (4) : ");
                                        codigo_compras = leer.nextInt();
                                        System.out.println("|-----------------------------|\n");

                                        switch (codigo_compras) {

                                            case 4:
                                                System.out.println("|---------------------------|");
                                                System.out.print("|Que Cantidad En k/g Desea : ");

                                                cantidad = leer.nextDouble();
                                                System.out.println("|---------------------------|");
                                                if (maiz >= cantidad) {
                                                    maiz -= cantidad;
                                                    cantidad_de_ventas += cantidad;
                                                    producto_disponible = true;
                                                    cantidad_maiz += cantidad;
                                                    subtotal += 20 * cantidad_maiz;
                                                    cantidad_ventas++;

                                                    if (subtotal > mayor_ganancia_venta) {
                                                        mayor_ganancia_venta = subtotal;
                                                    }

                                                } else {
                                                    System.out.println("\n|----------------------------------|");
                                                    System.out.println("|---No Hay Suficiente Producto----|");
                                                    System.out.print("|----------------------------------|\n");
                                                    producto_disponible = false;
                                                }
                                                System.out.print("|Desea Comprar Otro Producto (S/N) : ");
                                                otro_producto = leer.next().toUpperCase().charAt(0);
                                                break;

                                        }

                                    } while (otro_producto == 'S');
                                    //Final While
                                } else {
                                    System.out.println("\n|----------------------------------|");
                                    System.out.println("|---No Hay Productos Disponibles---|");
                                    System.out.println("|----------------------------------|\n");
                                }
                                
                                break;
                                //Fin Proveedor C
                            //Final Ventas
                        }
                        //Inicio De Facturacion
                        if (cantidad_de_ventas > 0) {
                            System.out.println("\n|------Factura------|\n");

                            if (cantidad_azucar > 0) {
                                System.out.println("Producto : Azucar");
                                System.out.println("Cantidad : " + cantidad_azucar + "k/g  ");
                                System.out.println("Precio Por k/g : 30");
                                System.out.println("Subtotal : Lps." + cantidad_azucar * 30 + "\n");
                            }

                            if (cantidad_avena > 0) {
                                System.out.println("Producto : Avena");
                                System.out.println("Cantidad : " + cantidad_avena + "k/g");
                                System.out.println("Precio Por k/g : 25");
                                System.out.println("Subtotal : Lps." + cantidad_avena * 25 + "\n");
                            }

                            if (cantidad_trigo > 0) {
                                System.out.println("Producto : Trigo");
                                System.out.println("Cantidad : " + cantidad_trigo + "k/g");
                                System.out.println("Precio Por k/g : 32");
                                System.out.println("Subtotal : Lps." + cantidad_trigo * 32 + "\n");
                            }

                            if (cantidad_maiz > 0) {
                                System.out.println("Producto : Maiz");
                                System.out.println("Cantidad : " + cantidad_maiz + "k/g  ");
                                System.out.println("Precio Por k/g : 20");
                                System.out.println("Subtotal : Lps." + cantidad_maiz * 20 + "\n");
                            }
                            isv_de_subtotal = subtotal * impuesto;
                            subtotal_con_isv = isv_de_subtotal + subtotal;

                            if (subtotal_con_isv < 1000) {
                                descuento = 0.0;
                            }
                            if (subtotal_con_isv >= 1000 && subtotal_con_isv < 5000) {
                                descuento = 0.05;
                            }
                            if (subtotal_con_isv >= 5000) {
                                descuento = 0.1;
                            }

                            double subtotal_descuento = subtotal_con_isv * descuento;
                            total = subtotal_con_isv - subtotal_descuento;

                            System.out.println("Su Subtotal Es : " + subtotal);
                            System.out.println("Su Subtotal Con El Impuesto Del 7% : Lps. " + isv_de_subtotal);
                            System.out.println("Su Porcentaje De Descuento: %" + descuento * 100);
                            System.out.println("La Cantidad De Su Descuento : Lps." + subtotal_descuento);
                            System.out.println("Su Total Es : Lps." + total);
                            System.out.println("\n|-------------------|\n");
                        } else {
                            System.out.println("\n|------------------------------|");
                            System.out.println("|---No Se Realizo Una Compra---|");
                            System.out.println("|------------------------------|\n");
                        }
                    } else if (abrircaja == false) {
                        System.out.println("\n|-----------------------------|");
                        System.out.println("|---  Tiene Que Abrir Caja ---|");
                        System.out.println("|-----------------------------|\n");
                    } else if (azucar <= 0 || maiz <= 0 || trigo <= 0 || avena <= 0) {
                        System.out.println("\n|------------------------------|");
                        System.out.println("|-------No Hay Productos-------|");
                        System.out.println("|------------------------------|\n");

                    }
                    //Final De Facturacion
                    break;
                //Break de Ventas
                    
                    //Inicio De Reportes
                case 4:
                    if (abrircaja) {
                        
                        //Calculos Para Reportes
                        if (cantidad_de_ventas > 0) {
                            valor_medio_compra = compra_media / cantidad_de_compras;
                            ganancia = ((subtotal - compra_media) / cantidad_de_ventas) ;
                            valor_medio_venta = subtotal / cantidad_de_ventas;
                        }
                        //Fin De Calculos De Reportes
                       
                        System.out.println("|-----------Reportes----------------|");
                        System.out.println("|Cantidad En Caja : Lps." + caja);
                        System.out.println("|Numero De Compras : " + cantidad_compras + "\n|Cantidad De Ventas : " + cantidad_ventas);
                        System.out.println("|Volumen De Compras : " + cantidad_de_compras + "\n|Volumen De Ventas : " + cantidad_de_ventas);
                        System.out.println("|Margen De Ganancia : %" + String.format("%.2f", ganancia));
                        System.out.println("|Valor Medio De Compra : Lps." + String.format("%.2f", valor_medio_compra) + "\n|Valor Medio De Venta : Lps." + String.format("%.2f", valor_medio_venta));
                        System.out.println("|El Mayor Gasto Fue De : Lps." + mayor_gasto_compra);
                        System.out.println("|La Mayor Ganancia Fue De : Lps." + mayor_ganancia_venta);
                        if (cantidad_azucar > cantidad_avena && cantidad_azucar > cantidad_trigo && cantidad_azucar > cantidad_maiz) {
                            System.out.println("|El Producto Estrella Es : Azucar");
                        } else if (cantidad_avena > cantidad_azucar && cantidad_avena > cantidad_trigo && cantidad_avena > cantidad_maiz) {
                            System.out.println("|El Producto Estrella Es : Avena");
                        } else if (cantidad_trigo > cantidad_azucar && cantidad_trigo > cantidad_avena && cantidad_trigo > cantidad_maiz) {
                            System.out.println("|El Producto Estrella Es : Trigo");
                        } else if (cantidad_maiz > cantidad_azucar && cantidad_maiz > cantidad_avena && cantidad_maiz > cantidad_trigo) {
                            System.out.println("|El Producto Estrella Es : Maiz");
                        }else{
                            System.out.println("|No Se Han Vendido Productos");
                        }
                        System.out.println("|-----------------------------------|\n");
                    } else {
                        System.out.println("\n|-----------------------------|");
                        System.out.println("|---  Tiene Que Abrir Caja ---|");
                        System.out.println("|-----------------------------|\n");
                    }
                    break;
                    //Fin De Reportes
                    
                //Inicio De Cierre De Caja
                case 5:
                    dia += 1;
                    System.out.println("|---               Cierre De Caja             ---|");
                    do {

                        System.out.println("|---Cantidad De Dinero En La Caja : Lps." + caja + "---|");
                        System.out.print("|Cuanto Desea Ingresar Al Banco (Max %60) : Lps.");

                        efectivo = leer.nextDouble();
                        System.out.println("|------------------------------------------------|");
                        if (efectivo / caja < 0.60) {
                            caja -= efectivo;
                            Si_No = 'N';
                        } else {
                            System.out.println("---------------------------");
                            System.out.println("|---Ingreso Mas Del %60---|");
                            System.out.println("---------------------------");

                            System.out.print("\nDesea Volver A Intentar (S/N)");
                            Si_No = leer.next().toUpperCase().charAt(0);
                        }
                        
                    } while (Si_No == 'S');
                    
                    //Volviendo Las Variables De Reportes A 0
                    cantidad_compras=0;
                    cantidad_ventas=0;
                    cantidad_de_compras=0;
                    cantidad_de_ventas=0;
                    compra_media=0;
                    subtotal=0;
                    valor_medio_compra=0;
                    valor_medio_venta=0;
                    cantidad_de_compras=0;
                    cantidad_de_ventas=0;
                    mayor_gasto_compra=0;
                    mayor_ganancia_venta=0;
                    cantidad_azucar=0;
                    cantidad_avena=0;
                    cantidad_trigo=0;
                    cantidad_maiz=0;
                    //Final De Las Variables En Reportes
                    break;
                //Break De Cierre De Caja
            }
            //Final Switch Opcion

        }
        //Final de While

    }
}
