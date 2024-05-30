package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile {
	public static File newFile(File destonationDir, ZipEntry zipEntry) throws IOException {
		File destFile = new File(destonationDir, zipEntry.getName());

		String destDirPath = destonationDir.getCanonicalPath();
		String destFilePath = destFile.getCanonicalPath();

		if (!destFilePath.startsWith(destDirPath + File.separator)) {
			throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
		}

		return destFile;

	}

	public static void main(String[] args) throws IOException {
		String fileZip = "C:\\Users\\baokh\\eclipse-workspace\\Java_76\\dirCompressed.zip";
		File desDir = new File("C:\\Users\\baokh\\eclipse-workspace\\Java_76\\unzipTest");
		byte[] buffe = new byte[1024];
		ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
		ZipEntry zipEntry = zis.getNextEntry();

		while (zipEntry != null) {
			File newFile = newFile(desDir, zipEntry);
			if (zipEntry.isDirectory()) {
				if (!newFile.isDirectory() && !newFile.mkdir()) {
					throw new IOException("Failed to create directory" + newFile);
				}
			} else {
				// fix for Windows-created archives
				File parent = newFile.getParentFile();
				if (!parent.isDirectory() && !parent.mkdirs()) {
					throw new IOException("Failed to create directory" + parent);
				}
				// write file content
				FileOutputStream fos = new FileOutputStream(newFile);
				int len;
				while ((len = zis.read(buffe)) > 0) {
					fos.write(buffe, 0, len);
				}
				fos.close();
			}
			zipEntry = zis.getNextEntry();
		}
		zis.closeEntry();
		zis.close();

	}
}
