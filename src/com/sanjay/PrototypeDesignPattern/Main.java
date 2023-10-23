package com.sanjay.PrototypeDesignPattern;

public class Main {

	public static void main(String[] args) {
		Student obj = new Student(10, 107117089, "Sanjay Kumar");
		Student obj2 = (Student) obj.clone();
		System.out.println(obj2.toString());
	}

}

public class SampleWebApplication implements EntryPoint, ClickHandler {
	SampleServiceAsync sampleServiceAsync = GWT.create(SampleService.class);
	Label lbl;
	TextBox textBox;

	/** * This is the entry point method. */
	public void onModuleLoad() {
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setSize("100%", "100%");
		verticalPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		verticalPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		textBox = new TextBox();
		Button btn = new Button("Get Update from Server");
		btn.addClickHandler(this);
		lbl = new Label("The text will be updated here.");
		Image image = new Image();
		image.setUrl("https://www.javatpoint.com/ uploads/ Javatpoint-logo.png");
		verticalPanel.add(textBox);
		verticalPanel.add(btn);
		verticalPanel.add(lbl);
		verticalPanel.add(image);
		RootLayoutPanel.get().add(verticalPanel);
	}

	@Override
	public void onClick(ClickEvent event) {
		sampleServiceAsync.sayHello(textBox.getText(), new AsyncCallback() {
			@Override
			public void onFailure(Throwable caught) {
// handle failure from server.  
				Window.alert("Exception Received from server.");
			}

			@Override
			public void onSuccess(String result) {
				lbl.setText(result);
			}
		});
	}
}