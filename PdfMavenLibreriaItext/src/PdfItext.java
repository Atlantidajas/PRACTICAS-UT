public class PdfItext {
	public static void main(String args[]) {
		try {
			
			// Listado de Personas
			ArrayList<String> lista = new ArrayList<String>();
			lista.add("Juan Garcia");
			lista.add("Andres Hern�ndez");
			lista.add("Reyes Est�vez");
			lista.add("Pedro Moreno");
			
			// Se crea la instancia del Documento.
			Document document = new Document();

			// Se crea el OutputStream para el fichero donde queremos escribir el pdf.
			OutputStream outputStream = new FileOutputStream(new File("Usuarios.pdf"));

			// Se crea el PDFWriter que realiza la asociaci�n entre el Documento y el OutputStream.
			PdfWriter.getInstance(document, outputStream);

			// Se abre el documento.
			document.open();
			
			// Se a�ade la cabecera
			document.add(new Paragraph("LISTADO:"));
			document.add(Chunk.NEWLINE);
			
			// Se a�ade el contenido del ArrayList.
			for (String persona: lista) {
				document.add(new Paragraph(persona));
			}

			// Se cierra el DocumentoClose document and outputStream.
			document.close();
			outputStream.close();

			System.out.println("Documento PDF creado correctamente.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}