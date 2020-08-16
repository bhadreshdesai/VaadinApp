package bdd.demo.vaadin.views.form;

import bdd.demo.vaadin.data.entity.Person;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.templatemodel.TemplateModel;
import bdd.demo.vaadin.views.main.MainView;

import bdd.demo.vaadin.views.form.FormView.FormViewModel;

@Route(value = "form", layout = MainView.class)
@PageTitle("Form")
@JsModule("./src/views/form/form-view.js")
@Tag("form-view")
public class FormView extends PolymerTemplate<FormViewModel> {

    // This is the Java companion file of a design
    // You can find the design file in /frontend/src/views/src/views/form/form-view.js
    // The design can be easily edited by using Vaadin Designer (vaadin.com/designer)

    public static interface FormViewModel extends TemplateModel {

    }

    @Id
    private TextField firstName;
    @Id
    private TextField lastName;
    @Id
    private TextField email;

    @Id
    private Button cancel;
    @Id
    private Button save;

    public FormView() {

        // Configure Form
        Binder<Person> binder = new Binder<>(Person.class);

        // Bind fields. This where you'd define e.g. validation rules
        binder.bindInstanceFields(this);

        cancel.addClickListener(e -> binder.readBean(null));
        save.addClickListener(e -> {
            Notification.show("Not implemented");
        });
    }
}
