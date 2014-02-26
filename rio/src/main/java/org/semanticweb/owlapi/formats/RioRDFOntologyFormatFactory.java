/**
 * 
 */
package org.semanticweb.owlapi.formats;

import org.openrdf.rio.RDFFormat;
import org.semanticweb.owlapi.model.OWLOntologyFormatFactory;

/**
 * @author Peter Ansell p_ansell@yahoo.com
 */
public interface RioRDFOntologyFormatFactory extends OWLOntologyFormatFactory {

    RioRDFOntologyFormat createFormat();

    RDFFormat getRioFormat();
}