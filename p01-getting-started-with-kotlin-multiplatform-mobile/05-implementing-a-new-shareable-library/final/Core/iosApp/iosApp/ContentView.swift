import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greet()
	let info = Greeting().info()

	var body: some View {
		Text(greet).onAppear {
		    Logger().d(tag: "ContentView", message: greet)
		}

		Text(info).onAppear {
		    Logger().d(tag: "ContentView", message: info)
		}
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}