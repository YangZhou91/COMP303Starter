package visitor;

/**
 * The common interface for file and directory nodes
 * 
 * @author Yang Zhou(260401719)
 *
 */
public interface FileSystemNode
{
	void accept(FileSystemVisitor v);
}
