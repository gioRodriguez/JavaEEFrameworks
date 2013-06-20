package com.tecgurus.whattimeisit.webii.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ModelDriven;
import com.tecgurus.whattimeisit.webii.models.HelloWorldModel;
import com.tecgurus.whattimeisit.webii.models.HijoModel;
import com.tecgurus.whattimeisit.webii.models.PadreModel;

public class HelloWorldAction implements ModelDriven {
	private HelloWorldModel helloWorldModel;

	public HelloWorldAction() {
		this.helloWorldModel = new HelloWorldModel();

		// //creado padre e hijos
		PadreModel padreModel = new PadreModel();
		HijoModel hijoModel = new HijoModel();
		HijoModel hijoModel2 = new HijoModel();
		HijoModel hijoModel3 = new HijoModel();

		// //Creando y llenando lista de hijos
		List<HijoModel> hijos = new ArrayList<HijoModel>();
		hijos.add(hijoModel);
		hijos.add(hijoModel2);
		hijos.add(hijoModel3);

		// //Entregando hijos a padre
		padreModel.setHijosModel(hijos);

		this.helloWorldModel.setPadreModel(padreModel);
	}

	public String execute() throws Exception {
		return "success";
	}

	@Override
	public Object getModel() {
		return this.helloWorldModel;
	}
}
