/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontControllerPattern;

/**
 *
 * @author nghiatc
 */
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request) {
        if (request.equalsIgnoreCase("STUDENT")) {
            studentView.show();
        } else {
            homeView.show();
        }
    }
}
