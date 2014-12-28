package com.example.settextbutton;

import android.widget.Button;

public class ButtonRC {
	//constructor
	ButtonRC(Button _bid, int r, int c) {
		SetButtonId(_bid);
		SetRow (r);
		SetColumn(c);
	}
	//setter
	public void SetButtonId(Button b) {
		m_buttonId = b;
	}
	public void SetRow(int r) {
		m_row = r;
	}
	public void SetColumn (int c) {
		m_column = c;
	}
	
	//Getters
	public Button GetButton() {
		return m_buttonId;
	}
	public int GetRow() {
		return m_row;
	}
	public int GetColumn() {
		return m_column;
	}
	private Button m_buttonId;
	private int m_row;
	private int m_column;
}
