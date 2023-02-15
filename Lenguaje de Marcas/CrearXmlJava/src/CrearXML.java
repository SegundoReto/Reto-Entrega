import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class CrearXML {
    public static void main(String argv[]) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            //Elemento raíz
            Document doc = docBuilder.newDocument();
            Element Usuario = doc.createElement("Usuario");
            doc.appendChild(Usuario);
            //Primer elemento
            Element id_Usuario = doc.createElement("id");
            Usuario.appendChild(id_Usuario);
            //Se agrega un atributo al nodo elemento y su valor
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            id_Usuario.setAttributeNode(attr);

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Iker");
            Usuario.appendChild(nombre);

            Element apellido = doc.createElement("apellido");
            apellido.setTextContent("Soto");
            Usuario.appendChild(apellido);

            Element correo = doc.createElement("correo");
            correo.setTextContent("ik.soto@aulanz.net");
            Usuario.appendChild(correo);

            Element telefono = doc.createElement("telefono");
            telefono.setTextContent("666666666");
            Usuario.appendChild(telefono);

            Element fechaNacimiento = doc.createElement("fechaNacimiento");
            fechaNacimiento.setTextContent("20/03/2004");
            Usuario.appendChild(fechaNacimiento);

            Element tipoUsuario = doc.createElement("tipoUsuario");
            tipoUsuario.setTextContent("administrador");
            Usuario.appendChild(tipoUsuario);



            //Se escribe el contenido del XML en un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:/Users/ikers/IdeaProjects/CrearXmlJava/Usuario.xml")); //Cambiar ruta 
            transformer.transform(source, result);
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}