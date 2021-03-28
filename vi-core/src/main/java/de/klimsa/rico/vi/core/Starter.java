package de.klimsa.rico.vi.core;

import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Starter {
		
	private static final Logger LOG = LoggerFactory.getLogger(Starter.class);
	
	public static void main(String[] args) {
		LOG.info("System started");

		OntModelSpec ontModelSpec = new OntModelSpec(OntModelSpec.OWL_DL_MEM_RULE_INF);
		
		OntModel ontModel = ModelFactory.createOntologyModel(ontModelSpec);
		
		Model model = ontModel.begin();
		
		ontModel.commit();
		
		LOG.info("System stopped");
	}

}
