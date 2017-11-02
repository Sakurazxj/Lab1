package jamin_lab1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DGraphTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testQueryBridgeWords() throws Exception {
		DGraph dgraph = new DGraph("F:\\Eclipse\\LAB1\\src\\source\\text\\test.txt");
		assertEquals("The bridge word from new to and is:life.",dgraph.queryBridgeWords("new", "and"));
		assertEquals("No  or  in the graph!",dgraph.queryBridgeWords("", ""));
		assertEquals("No and or  in the graph!",dgraph.queryBridgeWords("and", ""));
		assertEquals("No 1and or 2new in the graph!",dgraph.queryBridgeWords("1and", "2new"));
		assertEquals("No segment or stack in the graph!",dgraph.queryBridgeWords("segment", "stack"));
		assertEquals("No bridge word from seek to to!",dgraph.queryBridgeWords("seek", "to"));
		assertEquals("The bridge words from seek to new are:another,a,and out.",dgraph.queryBridgeWords("seek", "new"));
	}

}
