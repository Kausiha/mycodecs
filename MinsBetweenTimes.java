package guvi;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MinsBetweenTimes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Time in hh:mm:AM/PM Format :");
		String t1 = s.next();
		String t2 = s.next();
		String s1, s2;
		int hr1 = 0, hr2 = 0, m1 = 0, m2 = 0;
		int hr = 0, min = 0;
		StringTokenizer st = new StringTokenizer(t1, ":");
		StringTokenizer st1 = new StringTokenizer(t2, ":");
		if (st.hasMoreTokens() && st.hasMoreTokens()) {
			s1 = st.nextToken();
			s2 = st1.nextToken();
			hr1 = Integer.parseInt(s1);
			hr2 = Integer.parseInt(s2);
		} else
			System.out.println("Enter in correct format..");

		if (st.hasMoreTokens() && st.hasMoreTokens()) {
			s1 = st.nextToken();
			s2 = st1.nextToken();
			m1 = Integer.parseInt(s1);
			m2 = Integer.parseInt(s2);
		} else
			System.out.println("Enter in correct format..");
		if (st.hasMoreTokens() && st.hasMoreTokens()) {
			s1 = st.nextToken();
			s2 = st1.nextToken();
			if (s1.equals(s2)) {
				if ((hr2 > hr1) && (m1 > m2)) {
					hr = hr2 - hr1;
					hr = hr * 60;
					hr -= m1 - m2;
				} else if ((hr2 > hr1) && (m1 == m2)) {
					hr = hr2 - hr1;
					hr = hr * 60;
				} else if ((hr2 > hr1) && (m2 > m1)) {
					hr = hr2 - hr1;
					hr = hr * 60;
					hr -= m2 - m1;
				} else if ((hr1 > hr2) && (m1 > m2)) {
					hr = hr1 - hr2;
					hr = hr * 60;
					hr += m1 - m2;
				} else if ((hr1 > hr2) && (m1 == m2)) {
					hr = hr1 - hr2;
					hr = hr * 60;
				} else if ((hr1 > hr2) && (m2 > m1)) {
					hr = hr1 - hr2;
					hr = hr * 60;
					hr -= m2 - m1;
				} else if ((hr1 == hr2) && (m1 == m2)) {
					hr = 0;
				} else if ((hr1 == hr2) && (m1 > m2)) {
					min = m1 - m2;
					hr = min;
				} else if ((hr1 == hr2) && (m2 > m1)) {
					min = m2 - m1;
					hr = min;
				} else
					System.out.println("Enter in correct format..");
			} else {
				if ((hr2 > hr1) && (m1 == m2)) {
					hr = hr2 - hr1 + 12;
					hr = hr * 60;
				} else if ((hr2 > hr1) && (m1 > m2)) {

					hr = hr2 - hr1 + 11;
					hr = hr * 60;
					hr += 60;
					hr -= m1 - m2;
				} else if ((hr2 > hr1) && (m2 > m1)) {
					hr = hr2 - hr1 + 11;
					hr = hr * 60;
					hr += 60;
					hr += m2 - m1;
				} else if ((hr1 > hr2) && (m1 == m2)) {
					hr = hr1 - hr2 + 12;
					hr = hr * 60;
				} else if ((hr1 > hr2) && (m1 > m2)) {
					hr = hr1 - hr2 + 11;
					hr = hr * 60;
					hr += 60;
					hr -= m1 - m2;
				} else if ((hr1 > hr2) && (m2 > m1)) {
					hr = hr1 - hr2 + 11;
					hr = hr * 60;
					hr += 60;
					hr -= m2 - m1;
				} else if ((hr1 == hr2) && (m1 == m2)) {
					hr = hr1 - hr2 + 12;
					hr = hr * 60;
				} else if ((hr1 == hr2) && (m1 > m2)) {
					min = m1 - m2;
					hr = 12 * 60;
					hr += min;
				} else if ((hr1 == hr2) && (m2 > m1)) {
					min = m2 - m1;
					hr = 12 * 60 + min;
				} else
					System.out.println("Enter in correct format..");
			}
		} else
			System.out.println("Enter in correct format..");
		min += hr;
		System.out.println(hr);
	}
}
