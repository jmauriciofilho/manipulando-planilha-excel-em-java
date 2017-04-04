import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mauricio on 04/04/17.
 */
public class CompararPlanilhas {

	private static final String fileName = "planilhas/PLANILHAS MDER.xlsx";

	public static void main(String[] args) throws IOException{
		List<Pasciente> pascientesBIOMOL = new ArrayList<Pasciente>();
		List<Pasciente> pascientesSOROL = new ArrayList<Pasciente>();
		List<Pasciente> pascientesZIKA = new ArrayList<Pasciente>();

		try {
			FileInputStream arquivo = new FileInputStream(new File(CompararPlanilhas.fileName));

			// validando se é ou não um arquivo Excel...
			XSSFWorkbook workbook = new XSSFWorkbook(arquivo);

			// abrindo planilha específica do arquivo...
			XSSFSheet sheetPascientesBIOMOL = workbook.getSheetAt(0);
			XSSFSheet sheetPascientesSOROL = workbook.getSheetAt(1);
			XSSFSheet sheetPascientesZIKA = workbook.getSheetAt(2);


			// ler linha a linha do arquivo...
			Iterator<Row> rowIterator1 = sheetPascientesBIOMOL.iterator();
			Iterator<Row> rowIterator2 = sheetPascientesSOROL.iterator();
			Iterator<Row> rowIterator3 = sheetPascientesZIKA.iterator();

			// preenchendo listas de pascientes...
			preencherLista(rowIterator1, pascientesBIOMOL);
			preencherLista(rowIterator2, pascientesSOROL);
			preencherLista(rowIterator3, pascientesZIKA);

			arquivo.close();
		}catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.println("Arquivo excel não encontrado!");
		}

		/*
		 * Mostrar informação desejada...
		 */
		System.out.println("Os pascientes que se encontram nas três tabelas são:");
		for (int i = 0; i < pascientesBIOMOL.size(); i++) {
			int presenteTabela1 = 0;
			int presenteTabela2 = 0;
			double requisicao = pascientesBIOMOL.get(i).getRequisicao();
			for (int j = 0; j < pascientesSOROL.size(); j++) {
				if (requisicao == pascientesSOROL.get(j).getRequisicao()){
					presenteTabela1++;
				}
			}
			for (int j = 0; j < pascientesZIKA.size(); j++) {
				if (requisicao == pascientesZIKA.get(j).getRequisicao()){
					presenteTabela2++;
				}
			}
			if (presenteTabela1 > 0 && presenteTabela2 > 0) {
				System.out.println("Requisição: " + requisicao);
			}
		}



	}

	public static void preencherLista(Iterator<Row> rowIterator, List<Pasciente> pascientes){
		while (rowIterator.hasNext()){
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.cellIterator();
			Pasciente pasciente = new Pasciente();
			pascientes.add(pasciente);
			while (cellIterator.hasNext()){
				Cell cell = cellIterator.next();
				switch (cell.getColumnIndex()){
					case 0:
						pasciente.setRequisicao(cell.getNumericCellValue());
						break;
					case 1:
						pasciente.setPaciente(cell.getStringCellValue());
						break;
				}
			}

		}

	}
}
