package visitor;

public interface FileSystemVisitor
{
	void visitFileNode(FileNode node);

	void visitDirectory(DirectoryNode node);
}
