import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class LotteryGenerator {
	private static final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(650, 285);
		shell.setText("SWT Application");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setBounds(262, 10, 100, 15);
		lblNewLabel.setText("Lottery Generator");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(33, 67, 64, 64);
		formToolkit.adapt(composite);
		formToolkit.paintBordersFor(composite);
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setBounds(127, 67, 64, 64);
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		composite_2.setBounds(229, 67, 64, 64);
		formToolkit.adapt(composite_2);
		formToolkit.paintBordersFor(composite_2);
		
		Composite composite_3 = new Composite(shell, SWT.NONE);
		composite_3.setBounds(331, 67, 64, 64);
		formToolkit.adapt(composite_3);
		formToolkit.paintBordersFor(composite_3);
		
		Composite composite_4 = new Composite(shell, SWT.NONE);
		composite_4.setBounds(428, 67, 64, 64);
		formToolkit.adapt(composite_4);
		formToolkit.paintBordersFor(composite_4);
		
		Composite composite_5 = new Composite(shell, SWT.NONE);
		composite_5.setBounds(525, 67, 64, 64);
		formToolkit.adapt(composite_5);
		formToolkit.paintBordersFor(composite_5);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.setBounds(219, 173, 176, 31);
		formToolkit.adapt(btnNewButton, true, true);
		btnNewButton.setText("Generate Lottery Numbers");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
