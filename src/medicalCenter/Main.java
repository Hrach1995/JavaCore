package medicalCenter;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Doctor> doctors = new ArrayList<>();
        List<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("1...7");
            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {

                case 0 -> {
                    System.out.println("exit");
                    return;
                }
                case 1 -> {
                    System.out.println("Enter id, name, surname, phone, email, profession: ");

                    String docID = scanner.nextLine();
                    String docName = scanner.nextLine();
                    String docSurname = scanner.nextLine();
                    String docPhone = scanner.nextLine();
                    String docEmail = scanner.nextLine();
                    String docProfession = scanner.nextLine();

                    doctors.add(new Doctor(docID, docName, docSurname, docPhone, docEmail, docProfession));
                    System.out.println("Doctor added!");
                }
                case 2 -> {
                    System.out.println("search doctor by profession: ");
                    String prof = scanner.nextLine();

                    for (Doctor doctor : doctors) {
                        if (doctor.getProfession().equalsIgnoreCase(prof)) {
                            System.out.println(doctor);
                        }

                    }
                }
                case 3 -> {
                    System.out.println("delete doctor by id: ");
                    String ID = scanner.nextLine();

                    doctors.removeIf(d -> d.getId().equals(ID));
                    System.out.println("Doctor deleted!");
                }
                case 4 -> {
                    System.out.println(" change doctor  by id: ");
                    String id = scanner.nextLine();
                    for (Doctor d : doctors) {
                        if (d.getId().equals(id)) {
                            System.out.println("Մուտքագրեք նոր name, surname, email, phoneNumber, profession:");
                            d.setName(scanner.nextLine());
                            d.setSurname(scanner.nextLine());
                            d.setEmail(scanner.nextLine());
                            d.setPhone(scanner.nextLine());
                            d.setProfession(scanner.nextLine());
                            System.out.println("Doctor փոփոխված է");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("add patient: ");
                    String doctorId  = scanner.nextLine();

                    Doctor chosenDoctor = null;

                    for (Doctor doc : doctors) {
                        if (doc.getId().equals(doctorId )) {
                            chosenDoctor = doc;
                            break;
                        }
                    }

                    if (chosenDoctor != null) {
                        System.out.println("Մուտքագրեք patient-ի id, name, surname, phoneNumber:");
                        String patientId = scanner.nextLine();
                        String patientName = scanner.nextLine();
                        String patientSurname = scanner.nextLine();
                        String patientPhone = scanner.nextLine();

                        Patient patient = new Patient(
                                patientId, patientName, patientSurname, patientPhone, chosenDoctor, LocalDateTime.now()
                        );

                        patients.add(patient);
                        System.out.println("Patient ավելացված է");
                    } else {
                        System.out.println("Բժիշկը չի գտնվել");
                    }
                }
                case 6 -> {
                    System.out.println("print all  patients by doctor: ");
                    String doctorID = scanner.nextLine();
                    for (Doctor d : doctors) {
                        if (d.getId().equals(doctorID)) {
                            for (Patient p : patients) {
                                if (p.getDoctor().equals(d)) {
                                    System.out.println(p);
                                }
                            }
                        }
                    }
                }

                case 7 -> {
                    System.out.println("print all patients: ");
                    for (Patient patient : patients) {
                        System.out.println(patient);
                    }
                }
            }
        }
    }
}
