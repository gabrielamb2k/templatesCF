import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Solution {
  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;

  public static void main(String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));

    solve();
    out.close(); 
  }

  // Main solution logic
  public static void solve() throws IOException {

  }

  // Optimized input methods
  static String next() throws IOException {
    while (st == null || !st.hasMoreTokens()) {
      st = new StringTokenizer(br.readLine().trim());
    }
    return st.nextToken();
  }

  static int readInt() throws IOException { return Integer.parseInt(next()); }

  static long readLong() throws IOException { return Long.parseLong(next()); }

  static double readDouble() throws IOException {
    return Double.parseDouble(next());
  }

  static String readLine() throws IOException { return br.readLine().trim(); }

  // Add other common utility methods or data structures here as needed,
  // such as GCD, prime checks, sorting utilities, etc.
}

