package donat.shortcuts.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class FocusEditorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window == null) {
		    return null;
		}
		IWorkbenchPage page = window.getActivePage();
		if (page == null) {
		    return null;
		}
		IEditorPart editor = page.getActiveEditor();
		if (editor == null) {
		    return null;
		}
		editor.setFocus();
		return null;
	}
}
