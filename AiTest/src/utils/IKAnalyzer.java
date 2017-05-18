package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.wltea.analyzer.cfg.Configuration;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.dic.Dictionary;

public class IKAnalyzer {

	@Test
	public void Test() throws IOException
	{
		
		
		Reader reader=new StringReader("在北京，和同学清明节一起去哪里玩？");
		IKSegmenter segmenter=new IKSegmenter(reader, true);
		Lexeme lexeme;
		while((lexeme=segmenter.next())!=null)
		{
			System.out.println(lexeme.getLexemeText());
		}
	}

}
