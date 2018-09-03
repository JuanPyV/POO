import javax.swing.JOptionPane;

public class Database {

	public static void main(String[] args) {
		int indice = 0;
		Student[] estudiantes = new Student[10];
		boolean menu = true;
		while(menu) {
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción \n 1.-Agregar estudiante\n 2.-Editar estudiante\n 3.-Buscar estudiante\n 4.-Borrar estudiante\n 5.-Mostrar lista\n 6.-Mostrar alumno\n 7.-Salir"));
			
			switch(opcion) {
			
			case 1:
				String name = JOptionPane.showInputDialog("Ingresa el nombre del alumno");
				String lastName = JOptionPane.showInputDialog("Ingresa el apellido");
				int  grade = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion"));
				int attendanceNum = Integer.parseInt(JOptionPane.showInputDialog("Asistio=1, No asistio=0"));
				boolean attendance=false;
				if(attendanceNum == 1) {
					attendance = true;
				}else if(attendanceNum == 0) {
					attendance = false;
				}
				
				Student estud = new Student(name, lastName, grade, attendance);
				if(indice < 10) {
					indice = 0;
				}
				estudiantes[indice] = estud;
				indice++;
				
				break;
			case 2:
				int index = Integer.parseInt(JOptionPane.showInputDialog("Dame el indice:"));
				while (true) {
					if (index > 9) {
						JOptionPane.showMessageDialog(null,"Numero incorrecto");
					}else if(estudiantes[index] == null){
						JOptionPane.showMessageDialog(null, "El estudiante no existe");
						break;
					}else {
						String nameEdit = JOptionPane.showInputDialog("Ingresa el nombre del alumno");
						String lastNameEdit = JOptionPane.showInputDialog("Ingresa el apellido");
						int  gradeEdit = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la calificacion"));
						int attendanceNumEdit = Integer.parseInt(JOptionPane.showInputDialog("Asistio=1, No asistio=0"));
						boolean attendanceEdit=false;
						if(attendanceNumEdit == 1) {
							attendanceEdit = true;
						}else if(attendanceNumEdit == 0) {
							attendanceEdit = false;
						}
						
						Student estudEdit = new Student(nameEdit, lastNameEdit, gradeEdit, attendanceEdit);
						estudiantes[index] = estudEdit;
						break;
						
						
					}
				}
				
				break;
			case 3:
				break;
			case 4:
				break;
				
			case 5:
				break;
			case 6:
				break;
			case 7:
				menu = false;
				break;
				
				
				
			}
				
		}
		// TODO Auto-generated method stub

	}


}
