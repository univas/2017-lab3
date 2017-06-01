package br.edu.univas.si3.lab3.chart;

import java.io.File;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoDeLinha {

	//cria o gráfico
	public JFreeChart createChart(String chartTitle) {
		
		DefaultCategoryDataset dataSet = createDataset();
		
		JFreeChart lineChart = ChartFactory.createLineChart(
												chartTitle, 
												"Anos", 
												"Número de escolas", 
												dataSet,
												PlotOrientation.VERTICAL, 
												true, true, false);

		return lineChart;
	}

	//cria um dataSet
	private DefaultCategoryDataset createDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();

		//informações de escolas
		dataset.addValue(15, "escolas", "1970");
		dataset.addValue(25, "escolas", "1980");
		dataset.addValue(40, "escolas", "1990");
		dataset.addValue(60, "escolas", "2000");
		dataset.addValue(90, "escolas", "2010");
		dataset.addValue(110, "escolas", "2014");
		dataset.addValue(115, "escolas", "2015");
		dataset.addValue(125, "escolas", "2016");

		//informações de hospitais
//		dataset.addValue(1, "hospitais", "1970");
//		dataset.addValue(3, "hospitais", "1980");
//		dataset.addValue(7, "hospitais", "1990");
//		dataset.addValue(9, "hospitais", "2000");
//		dataset.addValue(15, "hospitais", "2010");
//		dataset.addValue(17, "hospitais", "2014");
//		dataset.addValue(18, "hospitais", "2015");
//		dataset.addValue(18, "hospitais", "2016");

		return dataset;
	}

	//salva o gráfico no arquivo
	public void saveToFile(String fileName, JFreeChart chart) {
		int width = 560; /* algura da imagem*/
		int height = 370; /* largura da imagem*/
		File pieChart = new File(fileName);
		try {
			ChartUtilities.saveChartAsJPEG(pieChart, chart, width, height);
		} catch (IOException e) {
			System.out.println("Erro ao salvar o arquivo do gráfico.");
			e.printStackTrace();
		}
	}

}
