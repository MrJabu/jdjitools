package com.darksimpson.jdjitools.duml;

public class Utils {
	private static final byte[] djiCrc8Table = {
		(byte) 0x00, (byte) 0x5E, (byte) 0xBC, (byte) 0xE2, (byte) 0x61, (byte) 0x3F, (byte) 0xDD, (byte) 0x83, (byte) 0xC2, (byte) 0x9C,
		(byte) 0x7E, (byte) 0x20, (byte) 0xA3, (byte) 0xFD, (byte) 0x1F, (byte) 0x41, (byte) 0x9D, (byte) 0xC3, (byte) 0x21, (byte) 0x7F,
		(byte) 0xFC, (byte) 0xA2, (byte) 0x40, (byte) 0x1E, (byte) 0x5F, (byte) 0x01, (byte) 0xE3, (byte) 0xBD, (byte) 0x3E, (byte) 0x60,
		(byte) 0x82, (byte) 0xDC, (byte) 0x23, (byte) 0x7D, (byte) 0x9F, (byte) 0xC1, (byte) 0x42, (byte) 0x1C, (byte) 0xFE, (byte) 0xA0,
		(byte) 0xE1, (byte) 0xBF, (byte) 0x5D, (byte) 0x03, (byte) 0x80, (byte) 0xDE, (byte) 0x3C, (byte) 0x62, (byte) 0xBE, (byte) 0xE0,
		(byte) 0x02, (byte) 0x5C, (byte) 0xDF, (byte) 0x81, (byte) 0x63, (byte) 0x3D, (byte) 0x7C, (byte) 0x22, (byte) 0xC0, (byte) 0x9E,
		(byte) 0x1D, (byte) 0x43, (byte) 0xA1, (byte) 0xFF, (byte) 0x46, (byte) 0x18, (byte) 0xFA, (byte) 0xA4, (byte) 0x27, (byte) 0x79,
		(byte) 0x9B, (byte) 0xC5, (byte) 0x84, (byte) 0xDA, (byte) 0x38, (byte) 0x66, (byte) 0xE5, (byte) 0xBB, (byte) 0x59, (byte) 0x07,
		(byte) 0xDB, (byte) 0x85, (byte) 0x67, (byte) 0x39, (byte) 0xBA, (byte) 0xE4, (byte) 0x06, (byte) 0x58, (byte) 0x19, (byte) 0x47,
		(byte) 0xA5, (byte) 0xFB, (byte) 0x78, (byte) 0x26, (byte) 0xC4, (byte) 0x9A, (byte) 0x65, (byte) 0x3B, (byte) 0xD9, (byte) 0x87,
		(byte) 0x04, (byte) 0x5A, (byte) 0xB8, (byte) 0xE6, (byte) 0xA7, (byte) 0xF9, (byte) 0x1B, (byte) 0x45, (byte) 0xC6, (byte) 0x98,
		(byte) 0x7A, (byte) 0x24, (byte) 0xF8, (byte) 0xA6, (byte) 0x44, (byte) 0x1A, (byte) 0x99, (byte) 0xC7, (byte) 0x25, (byte) 0x7B,
		(byte) 0x3A, (byte) 0x64, (byte) 0x86, (byte) 0xD8, (byte) 0x5B, (byte) 0x05, (byte) 0xE7, (byte) 0xB9, (byte) 0x8C, (byte) 0xD2,
		(byte) 0x30, (byte) 0x6E, (byte) 0xED, (byte) 0xB3, (byte) 0x51, (byte) 0x0F, (byte) 0x4E, (byte) 0x10, (byte) 0xF2, (byte) 0xAC,
		(byte) 0x2F, (byte) 0x71, (byte) 0x93, (byte) 0xCD, (byte) 0x11, (byte) 0x4F, (byte) 0xAD, (byte) 0xF3, (byte) 0x70, (byte) 0x2E,
		(byte) 0xCC, (byte) 0x92, (byte) 0xD3, (byte) 0x8D, (byte) 0x6F, (byte) 0x31, (byte) 0xB2, (byte) 0xEC, (byte) 0x0E, (byte) 0x50,
		(byte) 0xAF, (byte) 0xF1, (byte) 0x13, (byte) 0x4D, (byte) 0xCE, (byte) 0x90, (byte) 0x72, (byte) 0x2C, (byte) 0x6D, (byte) 0x33,
		(byte) 0xD1, (byte) 0x8F, (byte) 0x0C, (byte) 0x52, (byte) 0xB0, (byte) 0xEE, (byte) 0x32, (byte) 0x6C, (byte) 0x8E, (byte) 0xD0,
		(byte) 0x53, (byte) 0x0D, (byte) 0xEF, (byte) 0xB1, (byte) 0xF0, (byte) 0xAE, (byte) 0x4C, (byte) 0x12, (byte) 0x91, (byte) 0xCF,
		(byte) 0x2D, (byte) 0x73, (byte) 0xCA, (byte) 0x94, (byte) 0x76, (byte) 0x28, (byte) 0xAB, (byte) 0xF5, (byte) 0x17, (byte) 0x49,
		(byte) 0x08, (byte) 0x56, (byte) 0xB4, (byte) 0xEA, (byte) 0x69, (byte) 0x37, (byte) 0xD5, (byte) 0x8B, (byte) 0x57, (byte) 0x09,
		(byte) 0xEB, (byte) 0xB5, (byte) 0x36, (byte) 0x68, (byte) 0x8A, (byte) 0xD4, (byte) 0x95, (byte) 0xCB, (byte) 0x29, (byte) 0x77,
		(byte) 0xF4, (byte) 0xAA, (byte) 0x48, (byte) 0x16, (byte) 0xE9, (byte) 0xB7, (byte) 0x55, (byte) 0x0B, (byte) 0x88, (byte) 0xD6,
		(byte) 0x34, (byte) 0x6A, (byte) 0x2B, (byte) 0x75, (byte) 0x97, (byte) 0xC9, (byte) 0x4A, (byte) 0x14, (byte) 0xF6, (byte) 0xA8,
		(byte) 0x74, (byte) 0x2A, (byte) 0xC8, (byte) 0x96, (byte) 0x15, (byte) 0x4B, (byte) 0xA9, (byte) 0xF7, (byte) 0xB6, (byte) 0xE8,
		(byte) 0x0A, (byte) 0x54, (byte) 0xD7, (byte) 0x89, (byte) 0x6B, (byte) 0x35 };

	private static final int[] djiCrc16Table = {
		0x0000, 0x1189, 0x2312, 0x329B, 0x4624, 0x57AD, 0x6536, 0x74BF,
		0x8C48, 0x9DC1, 0xAF5A, 0xBED3, 0xCA6C, 0xDBE5, 0xE97E, 0xF8F7,
		0x1081, 0x0108, 0x3393, 0x221A, 0x56A5, 0x472C, 0x75B7, 0x643E,
		0x9CC9, 0x8D40, 0xBFDB, 0xAE52, 0xDAED, 0xCB64, 0xF9FF, 0xE876,
		0x2102, 0x308B, 0x0210, 0x1399, 0x6726, 0x76AF, 0x4434, 0x55BD,
		0xAD4A, 0xBCC3, 0x8E58, 0x9FD1, 0xEB6E, 0xFAE7, 0xC87C, 0xD9F5,
		0x3183, 0x200A, 0x1291, 0x0318, 0x77A7, 0x662E, 0x54B5, 0x453C,
		0xBDCB, 0xAC42, 0x9ED9, 0x8F50, 0xFBEF, 0xEA66, 0xD8FD, 0xC974,
		0x4204, 0x538D, 0x6116, 0x709F, 0x0420, 0x15A9, 0x2732, 0x36BB,
		0xCE4C, 0xDFC5, 0xED5E, 0xFCD7, 0x8868, 0x99E1, 0xAB7A, 0xBAF3,
		0x5285, 0x430C, 0x7197, 0x601E, 0x14A1, 0x0528, 0x37B3, 0x263A,
		0xDECD, 0xCF44, 0xFDDF, 0xEC56, 0x98E9, 0x8960, 0xBBFB, 0xAA72,
		0x6306, 0x728F, 0x4014, 0x519D, 0x2522, 0x34AB, 0x0630, 0x17B9,
		0xEF4E, 0xFEC7, 0xCC5C, 0xDDD5, 0xA96A, 0xB8E3, 0x8A78, 0x9BF1,
		0x7387, 0x620E, 0x5095, 0x411C, 0x35A3, 0x242A, 0x16B1, 0x0738,
		0xFFCF, 0xEE46, 0xDCDD, 0xCD54, 0xB9EB, 0xA862, 0x9AF9, 0x8B70,
		0x8408, 0x9581, 0xA71A, 0xB693, 0xC22C, 0xD3A5, 0xE13E, 0xF0B7,
		0x0840, 0x19C9, 0x2B52, 0x3ADB, 0x4E64, 0x5FED, 0x6D76, 0x7CFF,
		0x9489, 0x8500, 0xB79B, 0xA612, 0xD2AD, 0xC324, 0xF1BF, 0xE036,
		0x18C1, 0x0948, 0x3BD3, 0x2A5A, 0x5EE5, 0x4F6C, 0x7DF7, 0x6C7E,
		0xA50A, 0xB483, 0x8618, 0x9791, 0xE32E, 0xF2A7, 0xC03C, 0xD1B5,
		0x2942, 0x38CB, 0x0A50, 0x1BD9, 0x6F66, 0x7EEF, 0x4C74, 0x5DFD,
		0xB58B, 0xA402, 0x9699, 0x8710, 0xF3AF, 0xE226, 0xD0BD, 0xC134,
		0x39C3, 0x284A, 0x1AD1, 0x0B58, 0x7FE7, 0x6E6E, 0x5CF5, 0x4D7C,
		0xC60C, 0xD785, 0xE51E, 0xF497, 0x8028, 0x91A1, 0xA33A, 0xB2B3,
		0x4A44, 0x5BCD, 0x6956, 0x78DF, 0x0C60, 0x1DE9, 0x2F72, 0x3EFB,
		0xD68D, 0xC704, 0xF59F, 0xE416, 0x90A9, 0x8120, 0xB3BB, 0xA232,
		0x5AC5, 0x4B4C, 0x79D7, 0x685E, 0x1CE1, 0x0D68, 0x3FF3, 0x2E7A,
		0xE70E, 0xF687, 0xC41C, 0xD595, 0xA12A, 0xB0A3, 0x8238, 0x93B1,
		0x6B46, 0x7ACF, 0x4854, 0x59DD, 0x2D62, 0x3CEB, 0x0E70, 0x1FF9,
		0xF78F, 0xE606, 0xD49D, 0xC514, 0xB1AB, 0xA022, 0x92B9, 0x8330,
		0x7BC7, 0x6A4E, 0x58D5, 0x495C, 0x3DE3, 0x2C6A, 0x1EF1, 0x0F78
	};

	private static final int DJI_CRC8_INIT = 0x77;
	private static final int DJI_CRC16_INIT = 0x3692;

	public static byte calcDjiCrc8(byte[] data, int length)
	{
		byte tmpCrc = DJI_CRC8_INIT;

		for (int i = 0; i < length; i++) {
			tmpCrc = djiCrc8Table[(tmpCrc ^ data[i]) & 0xFF]; // '& 0xFF' also implicitly casts index to 'int'!
		}

		return tmpCrc;
	}

	public static int calcDjiCrc16(byte[] data, int length)
	{
		int tmpCrc = DJI_CRC16_INIT;

		for (int i = 0; i < length; i++) {
			tmpCrc = (tmpCrc >> 8) ^ djiCrc16Table[(tmpCrc ^ data[i]) & 0xFF];  // '& 0xFF' also implicitly casts index to 'int'!
		}

		return tmpCrc;
	}
}
