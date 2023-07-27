package Controller;

public class Controller {

    private iGetModel model;
    private iGetView view;

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        System.out.println("Welcome to Student App!");
        while(getNewIteration)
        {
            String command = view.prompt("Commands:\nList\nDelete\nExit\nEnter command:");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                case DELETE:
                    Long id = view.getStudentIdToDelete("Enter ID of student to delete: ");
                    model.deleteStudent(id);
                    break;
                case EXIT:
                    getNewIteration=false;
                    System.out.println("EXIT!");
                    break;
            }

        }
    }

    
}