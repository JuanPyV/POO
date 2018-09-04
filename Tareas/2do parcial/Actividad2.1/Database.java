import javax.swing.JOptionPane;

public class Database {

	public static void main(String[] args) {
		int indice = 0;
		Student[] estudiantes = new Student[10];
		boolean menu = true;
		while(menu) {
			int opcion = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n1.-Agregar estudiante\n2.-Editar estudiante\n3.-Buscar estudiante y calificacion\n4.-Borrar estudiante\n5.-Mostrar lista\n6.-Mostrar alumno\n7.-Salir"));

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
				if(indice == 9) {
					indice = 0;
				}
				estudiantes[indice] = estud;
				indice++;

				break;

			case 2:
				int index = Integer.parseInt(JOptionPane.showInputDialog("Dame el indice:"));
				while (menu) {
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
						menu = false;
						break;
					}
				}
				break;

			case 3:
				String nom = JOptionPane.showInputDialog("Dame el nombre:");
				String ape = JOptionPane.showInputDialog("Dame el apellido");
				boolean buscar = false;
				int x = 0;
					while(x < estudiantes.length) {
					if(estudiantes[x] != null) {
						if(estudiantes[x].getName().equals(nom) && estudiantes[x].getLastName().equals(ape)) {
							buscar = true;
							break;
						}
					}else {
						break;
					}
					x++;
				}

					if(buscar) {
						JOptionPane.showMessageDialog(null, "Calificacion: \n" + estudiantes[x].getGrade());
					}else {
						JOptionPane.showMessageDialog(null, "Alumno no encontrado");
					}
					break;

			case 4:
				int indexDel = Integer.parseInt(JOptionPane.showInputDialog("Dame el indice:"));
				estudiantes[indexDel] = null;
				for (int c=indexDel; c < 9; c++){
					estudiantes[c] = estudiantes[c+1];
				}
				break;

			case 5:
				for (int z = 0; z < estudiantes.length; z++){
					if(estudiantes[z] != null) {
						int asistencia = Integer.parseInt(JOptionPane.showInputDialog("Asistio "+
								estudiantes[z].getName()+ estudiantes[z].getLastName()+" ?"));
						if (asistencia == 1){
							estudiantes[z].setAttendance(true);
						}else if (asistencia == 0){
							estudiantes[z].setAttendance(false);
						}else{
							JOptionPane.showMessageDialog(null, "Opcion invalida");
						}
					}
				}
				break;

			case 6:
				for (int e = 0; e < estudiantes.length; e++){
					if(estudiantes[e] != null) {
					JOptionPane.showMessageDialog(null, "Nombre: "+estudiantes[e].getName()+"\n"+
					"Apellido: "+estudiantes[e].getLastName()+"\n"+"Calificacion: "+
					estudiantes[e].getGrade()+"\n"+"Asistencia: "+estudiantes[e].getAttendance());
					}
				}

					break;

			case 7:
				menu = false;
				break;

			}
		}
	}
}
