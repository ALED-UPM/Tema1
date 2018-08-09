package es.upm.dit.aled.lab1;

/**
 * Clase que filtra un modelo, extrayendo algunas sondas de cada muestra.
 * Equivale a un nuevo modelo del que solo quedan las sondas seleccionadas
 * @author mmiguel
 *
 */
public class FiltraMuestras implements FiltroEEG {

	private int[] validas;

	/**
	 * Construye el filtro indicando que sondas tienen informacion util
	 * @param sondasValidas sondas de las que se quiere recuperar los datos
	 */
	public FiltraMuestras(int[] sondasValidas) {
		// TODO
	}
	
	@Override
	public ModeloEEG aplicaFiltro(ModeloEEG eeg) {
		// TODO
		return null;
	}

}
