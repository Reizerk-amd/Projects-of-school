/* Realizar un programa que le pregunte a 5 personas cual es la ciudad de Colombia que le gustaría conocer. 
Teniendo en cuenta las respuestas de c/u de las personas, el programa debe mostrar información detallada de un lugar característico de dicha ciudad.*/
package ciclos;

import javax.swing.*;

public class Act_ciclos_completa {

    public static void main(String[] args) {
        int cont = 1;
        String info, ciudad;
        while (cont <= 5) {
            ciudad = JOptionPane.showInputDialog("¿Qué ciudad de Colombia te gustaría conocer? ");
            if (ciudad.equals("cali")) {
                JOptionPane.showMessageDialog(null, "Breve información sobre cali\n"
                        + "\n Está situada en la región Sur del Valle del Cauca, geográficamente la ciudad se ubica en el Valle del Río Cauca \n"
                        + "formado por la cordillera occidental \n"
                        + "\n y la cordillera central de la región andina, con una altura promedio de 1000 msnm.\n"
                        + "\n...\n"
                        + "\n El Valle del Cauca es uno de los departamentos más importantes en Colombia, \n"
                        + "\ntiene un clima promedio de 24°C por lo que es ideal para el turismo\n"
                        + "\n Farallones de Cali, Bahía Málaga y la Isla Malpelo esperan por tí.\n"
                        + "\n Además, en la capital puedes disfrutar de todo su desarrollo arquitectónico con influencia europea.");
            }
                    
            else if(ciudad.equals("bogota")) {
                JOptionPane.showMessageDialog(null, "Breve información sobre Bogotá\n"
                        + "\n  Bogotá, es la capital y la ciudad más grande de Colombia, tiene alrededor de 8 millones de habitantes. \n"
                        + "\n Constituye el centro político, económico, financiero y cultural del país,\n"
                        + "\n por lo tanto, es el punto de encuentro de personas de todas las regiones, lo que la hace diversa y multicultural.\n"
                        + "\n \n"
                        + "\n La Candelaria es el barrio más emblemático situado en el centro histórico de Bogotá. \n"
                        + "\n Aquí encontrarás la mayor parte de los edificios más bellos de Bogotá: la Casa de la Moneda, el Teatro Colón, \n"
                        + "\n la Quinta de Bolívar, el Eje Ambiental o el Observatorio\n");

            } else  if (ciudad.equals("medellin")) {
                JOptionPane.showMessageDialog(null, "Breve información sobre medellin \n"
                        + "\n Medellín está ubicada en el noroccidente de Colombia sobre la coordillera central con una altitud media de 1495 m.s.n.m. \n"
                        + "\nUbicada en el Valle del Aburrá, está rodeada de montañas y es conocida como la “Ciudad de la eterna primavera” por su clima que\n"
                        + " durante todo el año, promedia los 24°C.\n"
                        + "\n   \n"
                        + "\n En sus expresiones campesinas y más populares, por ejemplo, la trova, la copla, el tiple y la guitarra\n"
                        + "\n dan la tónica para la música de carrilera, la música guasca y la música andina, \n"
                        + "\nque incluye ésta última bambucos, sanjuaneros, torbellinos, guabinas, pasillos, rumbas, bundes y rajaleñas criollas.");

            }else if (ciudad.equals("pereira")){
                                JOptionPane.showMessageDialog(null, "Breve información sobre pereiraa \n"
                        + "\n Es la ciudad más poblada de la región del eje cafetero \n"
                        + "\n conforma el Área Metropolitana de Centro Occidente junto con los municipios de Dosquebradas y La Virginia. \n"
                        + "\n Está ubicada en la región centro-occidente del país, en el valle del río Otún en la Cordillera Central de los Andes colombianos. \n"
                        +"\n \n"
                        + "\n Pereira es reconocida en la región por su abundante comercio y el impulso industrial de la zona. \n"
                        + "\n La “Perla del Otún”, como es conocida la capital de Risaralda, cuenta con una temperatura promedio de 21°C y un área de extensión de 702 Km².");
            }else  if (ciudad.equals("cartagena")){
                        JOptionPane.showMessageDialog(null, "Breve información sobre cartagena \n"
                                +"Cartagena está situada en el departamento de Bolívar. \n"
                                + "\n Frente a la ciudad se forma la Bahía de Cartagena y se puede encontrar un rosario de islas como las de Barú, Tierrabomba, o el archipiélago del Rosario. \n"
                                + "\n En la zona hay grandes arrecifes de coral y playas de arena blanca.\n"
                                + "\n Cartagena es una de esas ciudades que evoca historia, romanticismo, elegancia, diversión y belleza natural. \n"
                                + "\n Es el segundo destino más visitado por extranjeros en Colombia y uno de los favoritos para quienes quieren disfrutar de unas buenas vacaciones en su país");
            }
            cont++;

        }
    }

}
