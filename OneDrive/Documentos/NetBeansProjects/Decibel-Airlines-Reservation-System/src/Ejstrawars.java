
import java.util.*;
public class Ejantesexa {
    public static void main(String[] args) {
        int S1,S2,respuesta,cont2,suma,cont,P1,P2,multi,N,fac,P,respuesta2,M,S,operacion1,operacion2,respuesta3;
        cont=0;
        Scanner leer = new Scanner(System.in);
        String inicio;
        
        System.out.println("====== STAR WARS CÓDIGOS SECRETOS ======");
        System.out.println("");
        System.err.println("Hace mucho tiempo, en una galaxia muy, muy lejana...");
        System.out.println("La Princesa Leia, LukeSkywalker,"); 
        System.out.println("Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada");
        System.out.println("en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio");
        System.out.println("está construyendo para destruirla.");
        System.out.println("(Presiona Intro para continuar)");
        inicio=leer.nextLine();
        cont++;
        while (cont==1) {
            S1=(int)(Math.random() * ((10 - 1) + 1)) + 1;
            S2=(int)(Math.random() * ((30 - 20) + 1)) + 20;
            System.out.println("=== Nivel 1 ===");
            System.out.println("");            
            System.err.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al sistema "+S1+" en el sector "+S2+ ", ");
            System.out.println(", pero el sistema de navegación está estropeado y el computador tiene problemas para calcular parte de las coordenadas de salto.");
            System.err.println("Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.");
            System.out.println("Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive).");
            System.out.println("¿Qué debe introducir?");

            suma=1;
            
            for (cont2=S1; cont2<=S2;cont2++) {
                suma=suma+cont2;

             }
             suma--;
             /*System.out.println("la respuesta es "+suma);comprobador de betatester*/
            System.out.print("\nEscribe la respuesta --> ");
            respuesta=leer.nextInt();
             if (suma==respuesta) {
                System.out.println("Has pasado al nivel 2");
                System.out.println("");
                cont++;

             }else{
                cont=0;
             }
        
        
        }

        while (cont==2) {
            P1=(int)(Math.random() * ((7 - 1) + 1)) + 1;
            P2=(int)(Math.random() * ((12 - 8) + 1)) + 20;
            System.out.println("=== Nivel 2 ===");
            System.out.println("");
            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella de la muerte.");
            System.out.println("Como van en una nave imperial robada se aproximan lentamente con la intención de pasar desapercibidos.");
            System.out.println("De repente suena el comunicador. Aquí agente de espaciopuerto "+P1+" contactando con nave imperial "+P2+".");
            System.out.println("No están destinados en este sector.");
            System.out.println("¿Qué hacen aquí?.");
            System.out.println("Han Solo coge el comunicador e improvisa.");
            System.out.println("Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para atracar y reparar la nave.");
            System.out.println(". El agente, que no se anda con tonterías, responde “Proporcione código de acceso o abriremos fuego. ");
            System.out.println("Han Solo ojea rápidamente el manual del piloto que estaba en la guantera y da con la página correcta.");
            System.out.println("El código es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).");
            System.out.println("¿Cuál es el código?");
            multi=1;
            for (cont2=P1; cont2<=P2;cont2++) {
                multi=multi*cont2;

             }
            /*System.out.println(multi);comprobador de betatester*/
            System.out.print("\nEscribe la respuesta --> ");
            respuesta=leer.nextInt();
             
             if (multi==respuesta) {
                System.out.println("Has pasado al nivel 3");
                System.out.println("");
                cont++;

             }else{
                cont=0;
             }
        }
        while (cont==3) {
            N=(int)(Math.random() * ((100 - 50) + 1)) + 50;
            System.out.println("=== Nivel 3 ===");
            System.out.println("");
            System.out.println("Han Solo proporciona el código correcto.");
            System.out.println("Atracan en la estrella de la muerte, ");
            System.out.println("se equipan con trajes de soldados imperiales que encuentran en la nave para pasar desapercibidos y bajan. ");
            System.out.println("Ahora deben averiguar en qué nivel de los "+N+" existentes se encuentra el reactor principal.");
            System.out.println("Se dirigen al primer panel computerizado que encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita introducir una clave de acceso");
            System.out.println(" Entonces recuerda la información que le proporcionó Lando Calrissian");
            System.out.println("La clave de acceso a los planos de la nave es el factorial de N/10 (redondeando N hacia abajo), donde N es el nº de niveles");
            System.out.println("¿Cual es el nivel correcto?");
            fac=1;
            System.out.print("N es = "+N);
            N=N/10;
            System.out.println(", N/10 es = "+N);
            for (cont2=1;cont2<=N;cont2++) {
                fac=fac*cont2;
            }
            /*System.out.println(fac);comprobador de betatester*/
            System.out.print("\nEscribe la respuesta --> ");
            respuesta=leer.nextInt();


           if (fac==respuesta) {
                System.out.println("Has pasado al nivel 4");
                System.out.println("");
                cont++;

             }else{
                cont=0;
             }
        
        
        }

        while (cont==4) {
            P=(int)(Math.random() * ((100 - 10) + 1)) + 10;
            respuesta2=0;
            System.out.println("=== Nivel 4 ===");
            System.out.println("");
            System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta");
            System.out.println("acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para ");
            System.out.println("intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita");
            System.out.println(" verificar si el número "+P+" es primo o no. Si es primo introduce un 1, ");
            System.out.println("si no lo es introduce un 0.");
            for ( cont2 = 0; cont2<1; cont2++ ){
                if ((P%2==0||P%3==0||P%5==0||P%7==0 || P%11==0)&&(P!=2&&P!=3&&P!=5&&P!=7&&P!=11)) {
                respuesta2=0;
                }else{ 
                respuesta2=1;
                }
            }
            /*System.err.println(respuesta2);comprobador de betatester*/
            System.out.print("\nEscribe la respuesta --> ");
            respuesta=leer.nextInt();

            if (respuesta2==respuesta) {
                System.out.println("Has pasado al nivel 5");
                System.out.println("");
                cont++;

             }else{
                cont=0;
            }

        }

        while (cont==5) {
            M=(int)(Math.random() * ((10 - 5) + 1)) + 5;
            S=(int)(Math.random() * ((10 - 5) + 1)) + 5;
            System.out.println("=== Nivel 5 ===");
            System.out.println("");
            System.err.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba, \nprograme el temporizador y salir de allí corriendo.");
            System.out.println(". Necesita programarlo para que explote en exactamente "+M+" minutos y "+S+" segundos,");
            System.err.println("el tiempo suficiente para escapar antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y desactive la bomba. ");
            System.out.println("Pero el temporizador utiliza un reloj Zordgiano un tanto peculiar.");
            System.out.println("Para convertir los minutos y segundos al sistema Zordgiano hay que sumar el factorial de "+M+" y el factorial de "+S);
            System.out.println("¿Qué valor debe introducir?");
            cont++;
            operacion1=1;
            operacion2=1;
            for (cont2=1;cont2<=M;cont2++) {
                operacion1=operacion1*cont2;
            }
            for (cont2=1;cont2<=S;cont2++) {
                operacion2=operacion2*cont2;
            }
            respuesta3=operacion1+operacion2;
            /*System.out.println(respuesta3);comprobador de betatester */
            System.out.print("\nEscribe la respuesta --> ");
            respuesta=leer.nextInt();

            if (respuesta3==respuesta) {
                System.out.println("");
                cont++;

             }else{
                cont=0;
            }
        }

        while (cont==6) {
            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a sonar las alarmas. ");
            System.out.println("Salen de allí corriendo, no hay tiempo que perder.");
            System.out.println("La nave se convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea consiguen llegar a la nave y salir de allí a toda prisa. ");
            System.out.println("A medida que se alejan observan por la ventana la imagen de la colosal estrella de la muerte explotando en el silencio del espacio,");
            System.out.println("desapareciendo para siempre junto a los restos del malvado imperio.");
            System.out.println("");
            System.out.println("¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");

            cont=7;
            
        }

        while (cont==0) {
            System.out.println("Ese no era el código correcto... La misión ha sido un fracaso... :( :( :");
            System.out.println("Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
            System.out.println("");
            cont=7;
        }

        while (cont==7) {
            System.out.println("Gracias por jugar :D");
            cont++;
            
        }
        
    }  
}
