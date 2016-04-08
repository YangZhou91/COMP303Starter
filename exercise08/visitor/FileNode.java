package visitor;

import java.io.File;

public class FileNode implements FileSystemNode
{
	public FileNode(File file)
	{
		this.file = file;
	}

	public File getFile()
	{
		return file;
	}

	@Override
	public void accept(FileSystemVisitor v)
	{
		// TODO Auto-generated method stub

	}

	private File file;
}
