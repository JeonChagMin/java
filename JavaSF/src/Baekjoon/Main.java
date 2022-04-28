package Baekjoon;

import java.io.*;
import java.util.*;
public class Main{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		int play = Integer.parseInt(word);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < play; i++) {
			String word1 = br.readLine();
			list.add(Integer.parseInt(word1));
		}
		list.sort(Comparator.naturalOrder());
		for(int n : list) {
			bw.write(n);
		}
		bw.flush();
		bw.close();
		
	}

}